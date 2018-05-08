import java.util.*;
import java.util.concurrent.locks.*;

public class BSTwithClasses
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
    private NodeM root;
    private static Random rand = new Random();
    
    class NodeM {
        private int val;
        private NodeG left;
        private NodeS right;

        public NodeM() {
            val = 13;
            left = null;
            right = null;
        }

        public NodeM(int thisval) {
            this();
            val = thisval;
        }

        public void insert() {
		left = new NodeG();
		left.insert();
		right = new NodeS();
		right.insert();
        }

        public int height() {
            if (left == null && right == null) {
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

            
            System.out.println(val);
            
        
            if (right != null) {
                right.inOrder();
            }
        }
    }

    class NodeA {
        private int val;
        private NodeA left;
        private NodeA right;

        public NodeA() {
            val = 1;
            left = null;
            right = null;
        }

        public NodeA(int thisval) {
            this();
            val = thisval;
        }

        public void insert() {
		return;
        }


        public int height() {
            if (left == null && right == null) {
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

            
            System.out.println(val);
            
        
            if (right != null) {
                right.inOrder();
            }
        }
    }

    class NodeB {
        private int val;
        private NodeA left;
        private NodeC right;

        public NodeB() {
            val = 2;
            left = null;
            right = null;
        }

        public NodeB(int thisval) {
            this();
            val = thisval;
        }

        public void insert() {
		left = new NodeA();
		left.insert();
		right = new NodeC();
		right.insert();
        }


        public int height() {
            if (left == null && right == null) {
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

            
            System.out.println(val);
            
        
            if (right != null) {
                right.inOrder();
            }
        }
    }

    class NodeC {
        private int val;
        private NodeC left;
        private NodeC right;

        public NodeC() {
            val = 3;
            left = null;
            right = null;
        }

        public NodeC(int thisval) {
            this();
            val = thisval;
        }

        public void insert() {
		return;
        }


        public int height() {
            if (left == null && right == null) {
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

            
            System.out.println(val);
            
        
            if (right != null) {
                right.inOrder();
            }
        }
    }

    class NodeD {
        private int val;
        private NodeB left;
        private NodeE right;

        public NodeD() {
            val = 4;
            left = null;
            right = null;
        }

        public NodeD(int thisval) {
            this();
            val = thisval;
        }

        public void insert() {
		left = new NodeB();
		left.insert();
		right = new NodeE();
		right.insert();
        }


        public int height() {
            if (left == null && right == null) {
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

            
            System.out.println(val);
            
        
            if (right != null) {
                right.inOrder();
            }
        }
    }

    class NodeE {
        private int val;
        private NodeE left;
        private NodeF right;

        public NodeE() {
            val = 5;
            left = null;
            right = null;
        }

        public NodeE(int thisval) {
            this();
            val = thisval;
        }

        public void insert() {
		right = new NodeF(6);
		right.insert();
        }


        public int height() {
            if (left == null && right == null) {
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

            
            System.out.println(val);
            
        
            if (right != null) {
                right.inOrder();
            }
        }
    }

    class NodeF {
        private int val;
        private NodeF left;
        private NodeF right;

        public NodeF() {
            val = 6;
            left = null;
            right = null;
        }

        public NodeF(int thisval) {
            this();
            val = thisval;
        }

        public void insert() {
		return;
        }

        public int height() {
            if (left == null && right == null) {
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

            
            System.out.println(val);
            
        
            if (right != null) {
                right.inOrder();
            }
        }
    }

    class NodeG {
        private int val;
        private NodeD left;
        private NodeJ right;

        public NodeG() {
            val = 7;
            left = null;
            right = null;
        }

        public NodeG(int thisval) {
            this();
            val = thisval;
        }

        public void insert() {
		left = new NodeD();
		left.insert();
		right = new NodeJ();
		right.insert();
        }

        public int height() {
            if (left == null && right == null) {
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

            
            System.out.println(val);
            
        
            if (right != null) {
                right.inOrder();
            }
        }
    }

    class NodeH {
        private int val;
        private NodeH left;
        private NodeH right;

        public NodeH() {
            val = 8;
            left = null;
            right = null;
        }

        public NodeH(int thisval) {
            this();
            val = thisval;
        }

        public void insert() {
		return;
        }

        public int height() {
            if (left == null && right == null) {
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

            
            System.out.println(val);
            
        
            if (right != null) {
                right.inOrder();
            }
        }
    }

    class NodeI {
        private int val;
        private NodeH left;
        private NodeI right;

        public NodeI() {
            val = 9;
            left = null;
            right = null;
        }

        public NodeI(int thisval) {
            this();
            val = thisval;
        }

        public void insert() {
		left = new NodeH();
		left.insert();
        }

        public int height() {
            if (left == null && right == null) {
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

            
            System.out.println(val);
            
        
            if (right != null) {
                right.inOrder();
            }
        }
    }

    class NodeJ {
        private int val;
        private NodeI left;
        private NodeL right;

        public NodeJ() {
            val = 10;
            left = null;
            right = null;
        }

        public NodeJ(int thisval) {
            this();
            val = thisval;
        }

        public void insert() {
		left = new NodeI();
		left.insert();
		right = new NodeL();
		right.insert();
        }

        public int height() {
            if (left == null && right == null) {
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

            
            System.out.println(val);
            
        
            if (right != null) {
                right.inOrder();
            }
        }
    }

    class NodeK {
        private int val;
        private NodeK left;
        private NodeK right;

        public NodeK() {
            val = 11;
            left = null;
            right = null;
        }

        public NodeK(int thisval) {
            this();
            val = thisval;
        }

        public void insert() {
		return;
        }

        public int height() {
            if (left == null && right == null) {
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

            
            System.out.println(val);
            
        
            if (right != null) {
                right.inOrder();
            }
        }
    }

    class NodeL {
        private int val;
        private NodeK left;
        private NodeL right;

        public NodeL() {
            val = 12;
            left = null;
            right = null;
        }

        public NodeL(int thisval) {
            this();
            val = thisval;
        }

        public void insert() {
		left = new NodeK();
		left.insert();
        }

        public int height() {
            if (left == null && right == null) {
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

            
            System.out.println(val);
            
        
            if (right != null) {
                right.inOrder();
            }
        }
    }

    class NodeP {
        private int val;
        private NodeO left;
        private NodeQ right;

        public NodeP() {
            val = 16;
            left = null;
            right = null;
        }

        public NodeP(int thisval) {
            this();
            val = thisval;
        }

        public void insert() {
		left = new NodeO();
		left.insert();
		right = new NodeQ();
		right.insert();
        }

        public int height() {
            if (left == null && right == null) {
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

            
            System.out.println(val);
            
        
            if (right != null) {
                right.inOrder();
            }
        }
    }

    class NodeO {
        private int val;
        private NodeN left;
        private NodeO right;

        public NodeO() {
            val = 15;
            left = null;
            right = null;
        }

        public NodeO(int thisval) {
            this();
            val = thisval;
        }

        public void insert() {
		left = new NodeN();
		left.insert();
        }

        public int height() {
            if (left == null && right == null) {
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

            
            System.out.println(val);
            
        
            if (right != null) {
                right.inOrder();
            }
        }
    }

    class NodeN {
        private int val;
        private NodeN left;
        private NodeN right;

        public NodeN() {
            val = 14;
            left = null;
            right = null;
        }

        public NodeN(int thisval) {
            this();
            val = thisval;
        }

        public void insert() {
		return;
        }

        public int height() {
            if (left == null && right == null) {
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

            
            System.out.println(val);
            
        
            if (right != null) {
                right.inOrder();
            }
        }
    }

    class NodeQ {
        private int val;
        private NodeQ left;
        private NodeR right;

        public NodeQ() {
            val = 17;
            left = null;
            right = null;
        }

        public NodeQ(int thisval) {
            this();
            val = thisval;
        }

        public void insert() {
		right = new NodeR();
		right.insert();
        }

        public int height() {
            if (left == null && right == null) {
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

            
            System.out.println(val);
            
        
            if (right != null) {
                right.inOrder();
            }
        }
    }

    class NodeR {
        private int val;
        private NodeR left;
        private NodeR right;

        public NodeR() {
            val = 18;
            left = null;
            right = null;
        }

        public NodeR(int thisval) {
            this();
            val = thisval;
        }

        public void insert() {
		return;
        }

        public int height() {
            if (left == null && right == null) {
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

            
            System.out.println(val);
            
        
            if (right != null) {
                right.inOrder();
            }
        }
    }

    class NodeS {
        private int val;
        private NodeP left;
        private NodeW right;

        public NodeS() {
            val = 19;
            left = null;
            right = null;
        }

        public NodeS(int thisval) {
            this();
            val = thisval;
        }

        public void insert() {
		left = new NodeP();
		left.insert();
		right = new NodeW();
		right.insert();
        }

        public int height() {
            if (left == null && right == null) {
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

            
            System.out.println(val);
            
        
            if (right != null) {
                right.inOrder();
            }
        }
    }

    class NodeW {
        private int val;
        private NodeU left;
        private NodeY right;

        public NodeW() {
            val = 23;
            left = null;
            right = null;
        }

        public NodeW(int thisval) {
            this();
            val = thisval;
        }

        public void insert() {
		left = new NodeU();
		left.insert();
		right = new NodeY();
		right.insert();
        }

        public int height() {
            if (left == null && right == null) {
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

            
            System.out.println(val);
            
        
            if (right != null) {
                right.inOrder();
            }
        }
    }

    class NodeU {
        private int val;
        private NodeT left;
        private NodeV right;

        public NodeU() {
            val = 21;
            left = null;
            right = null;
        }

        public NodeU(int thisval) {
            this();
            val = thisval;
        }

        public void insert() {
		left = new NodeT();
		left.insert();
		right = new NodeV();
		right.insert();
        }

        public int height() {
            if (left == null && right == null) {
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

            
            System.out.println(val);
            
        
            if (right != null) {
                right.inOrder();
            }
        }
    }

    class NodeY {
        private int val;
        private NodeX left;
        private NodeZ right;

        public NodeY() {
            val = 25;
            left = null;
            right = null;
        }

        public NodeY(int thisval) {
            this();
            val = thisval;
        }

        public void insert() {
		left = new NodeX();
		left.insert();
		right = new NodeZ();
		right.insert();
        }

        public int height() {
            if (left == null && right == null) {
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

            
            System.out.println(val);
            
        
            if (right != null) {
                right.inOrder();
            }
        }
    }

    class NodeT {
        private int val;
        private NodeT left;
        private NodeT right;

        public NodeT() {
            val = 20;
            left = null;
            right = null;
        }

        public NodeT(int thisval) {
            this();
            val = thisval;
        }

        public void insert() {
		return;
        }

        public int height() {
            if (left == null && right == null) {
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

            
            System.out.println(val);
            
        
            if (right != null) {
                right.inOrder();
            }
        }
    }

    class NodeV {
        private int val;
        private NodeV left;
        private NodeV right;

        public NodeV() {
            val = 22;
            left = null;
            right = null;
        }

        public NodeV(int thisval) {
            this();
            val = thisval;
        }

        public void insert() {
		return;
        }

        public int height() {
            if (left == null && right == null) {
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

            
            System.out.println(val);
            
        
            if (right != null) {
                right.inOrder();
            }
        }
    }

    class NodeX {
        private int val;
        private NodeX left;
        private NodeX right;

        public NodeX() {
            val = 24;
            left = null;
            right = null;
        }

        public NodeX(int thisval) {
            this();
            val = thisval;
        }

        public void insert() {
		return;
        }

        public int height() {
            if (left == null && right == null) {
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

            
            System.out.println(val);
            
        
            if (right != null) {
                right.inOrder();
            }
        }
    }

    class NodeZ {
        private int val;
        private NodeZ left;
        private NodeZ right;

        public NodeZ() {
            val = 26;
            left = null;
            right = null;
        }

        public NodeZ(int thisval) {
            this();
            val = thisval;
        }

        public void insert() {
		return;
        }

        public int height() {
            if (left == null && right == null) {
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

            
            System.out.println(val);
            
        
            if (right != null) {
                right.inOrder();
            }
        }
    }

    public BSTwithClasses() {
        root = new NodeM();
        mx = new ReentrantReadWriteLock();
    }
    
    public void insert() {
	    root = new NodeM();
	    root.insert();
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
        BSTwithClasses t;
        
        public TreeRW(BSTwithClasses t) {
            this.t = t;
            assert t != null;
        }

        public void run() {
		t.root.insert();
        }
    }

    public static void main(String[] args) {

	StartSentinel startobj = new StartSentinel();
        int numThreads = 1;

        BSTwithClasses t = new BSTwithClasses();

	t.insert();


        t.inOrder();

	EndSentinel endobj = new EndSentinel();
    }       
}
