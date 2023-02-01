package Trees.BinaryTree;

public class KthSmallestElement {
    static class Node {
        int key;
        Node left, right;
        Node(int d){
            key = d;
            left = right = null;
        }
    }
    static Node root = null;
    static int count = 0;
    public static Node insert(Node root, int key){
        if (root == null){
            return new Node(key);
        }
        if (key < root.key){
            root.left = insert(root.left, key);
        } else if(key > root.key){
            root.right = insert(root.right, key);
        }
        return root;
    }
    public static Node kthSmallestEle(Node root, int key){
        if (root == null)
            return null;
        Node left = kthSmallestEle(root.left, key);
        if (left != null) {
            return left;
        }
        count++;
        if (count == key)
            return root;
        return kthSmallestEle(root.right, key);
    }
    static void printKthSmallestElement(Node root, int key){
        Node res = kthSmallestEle(root,key);
        if (res == null)
            System.out.println("There are less than k nodes in the bst");
        else
            System.out.println("K-th Smallest Element is " + res.key);
    }
    public static void main(String[] args) {
        int key[] = {20, 8, 22, 4, 12, 10, 14};
        for (int x: key) {
            root = insert(root,x);
        }
        int k = 3;
        printKthSmallestElement(root,k);
    }
}
