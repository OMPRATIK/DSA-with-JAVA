public class treeHeight {
    static class Node {
        int data;
        Node left,right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    // CALCULATE HEIGHT OF A TREE
    public static int height(Node root) {
        if(root == null) return 0;
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh,rh) + 1;
    }
    // COUNT NUMBER OF NODES IN A TREE
    public static int countNodes(Node root) {
        if(root == null) return 0;
        int lc = countNodes(root.left);
        int rc = countNodes(root.right);
        return lc+rc+1;
    }
    // SUM OF NODES IN A TREE
    public static int sum(Node root) {
        if(root == null) return 0;
        int leftSum = sum(root.left);
        int rightSum = sum(root.right);
        return leftSum + rightSum + root.data;
    }
    // DIAMETER OF A TREE O(n*n)
    public static int diam(Node root) {
        if(root == null) return 0;

        int leftDiam = diam(root.left);
        int lh = height(root.left);
        int rightDiam = diam(root.right);
        int rh = height(root.right);
        int selfDiam = lh + rh +1; // diameter that passes through the root
        return Math.max(selfDiam,Math.max(leftDiam,rightDiam));
    }
    // DIAMETER OF A TREE  
    public static Info diameter2(Node root) {
        if(root == null) {
            return new Info(0,0);
        }
        Info leftinfo = diameter2(root.left);
        Info rightinfo = diameter2(root.right);
        int diam = Math.max(Math.max(leftinfo.diam,rightinfo.diam),leftinfo.ht + rightinfo.ht +1);
        int ht = Math.max(leftinfo.ht,rightinfo.ht) +1;

        return new Info(diam,ht);
    }
    static class Info {
        int diam;
        int ht;
        public Info(int diam,int ht) {
            this.diam = diam;
            this.ht = ht;
        }
    }
    // Kth LEVEL OF BINARY TREE
        public static void Klevel(Node root,int level,int k) {
            if(root == null) {
                return;
            }
            if(level == k) {
                System.out.print(root.data + " ");
                return;
            }
            Klevel(root.left, level+1, k);
            Klevel(root.right, level+1, k);
        }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(9);
        root.right.right = new Node(5);
        //System.out.println("Height of Binary tree is "+ height(root));
        //System.out.println("number of Nodes in Tree is "+ countNodes(root));
        //System.out.println("Sum of nodes in the root is "+ sum(root));
        //System.out.println("Diameter of tree is "+diam(root));
        //System.out.println(diameter2(root).diam);
        Klevel(root,1,5);
    }
}
