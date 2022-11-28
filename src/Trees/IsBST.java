package Trees;

public class IsBST {
    static class Node{
        int key;
        Node left, right;
        Node(int d){
            key = d;
            left = right = null;
        }
    }
    Node root = null;
    static int maxValue(Node node){
        if (node == null){
            return Integer.MAX_VALUE;
        }
        int value = node.key;
        int leftMax = maxValue(node.left);
        int rightMax = maxValue(node.right);

        return Math.max(value, Math.max(leftMax,rightMax));
    }
    static int minValue(Node node){
        if (node == null){
            return Integer.MIN_VALUE;
        }
        int value = node.key;
        int leftMin = minValue(node.left);
        int rightMin = minValue(node.right);

        return Math.min(value, Math.min(leftMin,rightMin));
    }
    static int isBST(Node node){
        if (node == null){
            return 1;
        }
        if (node.left != null && maxValue(node.left) > node.key){
            return 0;
        }
        if (node.right != null && maxValue(node.right) > node.key){
            return 0;
        }
        if (isBST(node.left) != 1 || isBST(node.right) != 1) {
            return 0;
        }
        return 1;
    }
    public static void main(String[] args) {
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(5);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        if (isBST(root) != 1){
            System.out.println("It is a BST");
        } else {
            System.out.println("It is not BST");
        }
    }
}
