import java.util.*;
import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentRW {
    private static Random rand = new Random();

    public static String randomString() {
        byte[] array = new byte[10];
        rand.nextBytes(array);
        String randomString = new String(array, Charset.forName("ASCII"));
        return randomString;
    }

    public static int randomBoundedInt() {
        return rand.nextInt(10001);
    }


    static class DataRW implements Runnable {

        Map<Integer, String> map;

        DataRW(ConcurrentHashMap<Integer, String> map) {
            this.map = map;
        }

        public void run() {
            for (int i = 0; i < 1000; i++) {
                int idx = ConcurrentRW.randomBoundedInt();
                String item = ConcurrentRW.randomString();
                map.put(idx, item);
                System.out.printf("%d: %s\n", idx, item);
            }
        }

    }

    public static void main(String[] args) {

        int numThreads = 1;

        if (args.length == 0) {
            System.err.println("Usage: java ConcurrentRW [num of threads]");
            System.exit(1);
        } else {
            try {
                numThreads = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.err.println("Usage: java ConcurrentRW [num of threads]");
                System.exit(1);
            }
        }

        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();

        List<Thread> threadPool = new ArrayList<>();

        for (int i = 0; i < numThreads; i++) {
            DataRW rw = new DataRW(map);
            threadPool.add(new Thread(rw));
        }

        for (Thread t : threadPool) {
            t.start();
        }

        for (Thread t : threadPool) {
            try {
                t.join();
            } catch (InterruptedException e) {
                System.err.println("Error encountered when trying to join");
            }
        }


    }

}
