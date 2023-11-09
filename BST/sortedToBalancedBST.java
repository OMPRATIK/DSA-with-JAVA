import java.util.*;
public class sortedToBalancedBST {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }
    public static void preOrder(Node root) {
        if(root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static Node createBST(int arr[],int st,int end) {
        if(st>end) {
            return null;
        }
        int mid = (st + end)/2;
        Node root = new Node(arr[mid]);
        root.left = createBST(arr, st, mid-1);
        root.right = createBST(arr, mid+1, end);
        return root;
    }
    // CONVERT BST TO BALANCED BST
    public static void getInorder(Node root,ArrayList<Integer>inorder) {
        if(root == null) {
            return;
        }
        getInorder(root.left, inorder);
        inorder.add(root.data);
        getInorder(root.right, inorder);
    }
    public static Node createBST2(ArrayList<Integer>inorder,int si,int ei) {
        if(si > ei) {
            return null;
        }
        int mid = (si+ei)/2;
        Node root = new Node(inorder.get(mid));
        root.left = createBST2(inorder, si, mid-1);
        root.right = createBST2(inorder, mid+1, ei);
        return root;
    }
    public static Node balancedBST(Node root) {
        // inorder seq
        ArrayList<Integer> inorder= new ArrayList<>();
        getInorder(root, inorder);
        root = createBST2(inorder, 0, inorder.size()-1);
        return root;

    }
    public static void main(String[] args) {
        int arr[] = {3, 5, 6, 8, 10, 11, 12};
        Node root = createBST(arr, 0, arr.length-1);
        preOrder(root);
        System.out.println();
        Node root1 = new Node(8);
        root1.left = new Node(6);
        root1.left.left = new Node(5);
        root1.left.left.left = new Node(3);

        root1.right = new Node(10);
        root1.right.right = new Node(11);
        root1.right.right.right = new Node(12);
        root1 = balancedBST(root1);
        preOrder(root1);
    }
}
