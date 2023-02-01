package Trees.BinaryTree;

import java.util.Stack;

public class InorderTraversalWithOutRecursion {
    private Node root;
    private static class Node{
        int key;
        Node left,right;
        Node(int key){
            this.key = key;
            this.left = this.right = null;
        }
    }
    void inorderTraversalWithOutRecursion(Node root){
        if (root == null){
            return;
        }
        Stack<Node> stack = new Stack<Node>();
        Node curr = root;
        while (curr != null || stack.size() > 0){
            while (curr != null){
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            System.out.print(curr.key + " ");
            curr = curr.right;
        }
    }
    public static void main(String[] args) {
        InorderTraversalWithOutRecursion tree = new InorderTraversalWithOutRecursion();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.inorderTraversalWithOutRecursion(tree.root);
    }
}
