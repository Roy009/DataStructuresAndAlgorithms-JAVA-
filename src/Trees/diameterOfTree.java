package Trees;

public class diameterOfTree {
    private Node root;
    private static class Node{
        int key;
        Node left, right;
        Node(int k){
            key = k;
            left = right = null;
        }
    }
    diameterOfTree(){
        root = null;
    }
    int diameter(Node node){
        if (node == null){
            return 0;
        }
        int lheight = height(node.left);
        int rheight = height(node.right);

        int ldiameter = diameter(node.left);
        int rdiameter = diameter(node.right);
        return Math.max(1 + lheight + rheight,Math.max(ldiameter,rdiameter));
    }
    int diameter(){
        return diameter(root);
    }
    static int height(Node node){
        if (node == null)
            return 0;
        return 1 + Math.max(height(node.left), height(node.right));
    }
    public static void main(String[] args) {
        diameterOfTree dt = new diameterOfTree();
        dt.root = new Node(1);
        dt.root.left = new Node(2);
        dt.root.right = new Node(3);
        dt.root.left.left = new Node(4);
        dt.root.left.right = new Node(5);
        dt.root.right.left = new Node(6);
        dt.root.right.right = new Node(7);
        System.out.println("The diameter of the tree is " + dt.diameter());
    }
}
