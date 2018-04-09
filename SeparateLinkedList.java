import java.util.*;

public class SeparateLinkedList {
    static class Writer implements Runnable {
        private LinkedList<Integer> list;
        private Random rand = new Random();
        private int id;

        Writer(int id) {
            this.list = new LinkedList<>();
            this.id = id;
        }

        private int randomBoundedInt() {
            return rand.nextInt(10001);
        }

        public void run() {
            for (int i = 0; i < 1000; i++) {
                int next = randomBoundedInt();
                list.add(next);
                System.out.printf("Thread #%d: %d\n", id, next);
            }
        }
    }

    public static void main(String[] args) {
        int numThreads = 1;

        if (args.length == 0) {
            System.err.println("Usage: java SeparateLinkedList [num of threads]");
            System.exit(1);
        } else {
            try {
                numThreads = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.err.println("Usage: java SeparateLinkedList [num of threads]");
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
