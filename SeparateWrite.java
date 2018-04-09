import java.util.*;
import java.nio.charset.Charset;

public class SeparateWrite {
    static class Writer implements Runnable {
        private Map<Integer, String> map;
        private Random rand = new Random();
        private int id;

        Writer(int id) {
            this.map = new HashMap<>();
            this.id = id;
        }

        private String randomString() {
            byte[] array = new byte[10];
            rand.nextBytes(array);
            String randomString = new String(array, Charset.forName("ASCII"));
            return randomString;
        }

        private int randomBoundedInt() {
            return rand.nextInt(10001);
        }

        public void run() {
            for (int i = 0; i < 1000; i++) {
                int idx = randomBoundedInt();
                String item = randomString();
                map.put(idx, item);
                System.out.printf("%d: %s\n", idx, item);
            }
        }
    }

    public static void main(String[] args) {
        int numThreads = 1;

        if (args.length == 0) {
            System.err.println("Usage: java SeparateWrite [num of threads]");
            System.exit(1);
        } else {
            try {
                numThreads = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.err.println("Usage: java SeparateWrite [num of threads]");
                System.exit(1);
            }
        }

        List<Thread> threadPool = new ArrayList<>();

        for (int i = 0; i < numThreads; i++) {
            Writer w = new Writer(i);
            threadPool.add(new Thread(w));
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
