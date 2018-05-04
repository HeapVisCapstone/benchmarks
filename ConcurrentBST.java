import java.util.*;
import java.util.concurrent.locks.*;

public class ConcurrentBST<T extends Comparable<T>>
{

    static class StartSentinel {
        public StartSentinel() {
            System.out.println("Starting main...");
        }
    }

    static class EndSentinel {
        public EndSentinel() {
            System.out.println("Ending main...");
        }
    }

    private ReadWriteLock mx;
    private Node<T> root;
    private static Random rand = new Random();
    
    class Node<T extends Comparable<T>> {
        private T val;
        private Node<T> left;
        private Node<T> right;

        public Node() {
            val = null;
            left = null;
            right = null;
        }

        public Node(T initVal) {
            this();
            val = initVal;
        }

        public void insert(T insertVal) {       
            if (val == null) {
                val = insertVal;
                return;
            }

            if (val.compareTo(insertVal) <= 0) {
                if (right == null) {
                    right = new Node<T>(insertVal);
                } else {
                    right.insert(insertVal);
                }
            } else if (left == null) {
                left = new Node<T>(insertVal);
            } else {
                left.insert(insertVal);
            }
        }

        public int height() {
            if (val == null) {
                return 0;
            } else if (left == null && right == null) {
                return 1;
            } else if (left == null) {
                return 1 + right.height();
            } else if (right == null) {
                return 1 + left.height();
            } else {
                return 1 + Math.max(left.height(), right.height());
            }

        }

        public void inOrder() {
            if (left != null) {
                left.inOrder();
            }

            if (val != null) {
                System.out.println(val);
            }
        
            if (right != null) {
                right.inOrder();
            }
        }
    }

    public ConcurrentBST() {
        root = new Node<T>();
        mx = new ReentrantReadWriteLock();
    }
    
    public void insert(T insertVal) {
        mx.writeLock().lock();
        root.insert(insertVal);
        mx.writeLock().unlock();
    }

    public int height() {
        mx.readLock().lock();
        int height = root.height();
        mx.readLock().unlock();
        return height;
    }

    public void inOrder() {
        mx.readLock().lock();
        root.inOrder();
        mx.readLock().unlock();
    }

    static class TreeRW implements Runnable {
        ConcurrentBST<Integer> t;
        
        public TreeRW(ConcurrentBST<Integer> t) {
            this.t = t;
            assert t != null;
        }

        public void run() {
            for (int i = 0; i < 1000; i++) {
                t.insert(rand.nextInt(20001));
            }
        }
    }

    public static void main(String[] args) {
        StartSentinel startobj = new StartSentinel();
    
        int numThreads = 1;

        if (args.length == 0) {
            System.err.println("Usage: java ConcurrentBST [num of threads]");
            System.exit(1);
        } else {
            try {
                numThreads = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.err.println("Usage: java ConcurrentBST [num of threads]");
                System.exit(1);
            }
        }
        
        ConcurrentBST<Integer> t = new ConcurrentBST<>();

        List<Thread> threadPool = new ArrayList<>();

        for (int i = 0; i < numThreads; i++) {
            TreeRW rw = new TreeRW(t);
            threadPool.add(new Thread(rw));
        }

        for (Thread th : threadPool) {
            th.start();
        }

        for (Thread th : threadPool) {
            try {
                th.join();
            } catch (InterruptedException e) {
                System.err.println("Error encountered when trying to join");
            }
        }

        t.inOrder();
        
        EndSentinel endobj = new EndSentinel();
    }       
}
