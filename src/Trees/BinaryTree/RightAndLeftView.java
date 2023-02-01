package Trees.BinaryTree;

import java.util.ArrayList;

public class RightAndLeftView {
    private Node root;
    private static class Node{
        int key;
        Node left, right;
        Node(int k){
            key = k;
            left = right = null;
        }
    }
    static ArrayList<Integer> rightView(Node root){
        ArrayList<Integer> result = new ArrayList<>();
        int depth = 0;
        helper1(result,root,depth);
        return result;
    }
    static void helper1(ArrayList<Integer> result, Node root, int depth){
        if(root == null) return;
        if (depth == result.size()) result.add(root.key);
        helper1(result,root.right,depth+1);
        helper1(result,root.left,depth+1);
    }
    static ArrayList<Integer> leftView(Node root){
        ArrayList<Integer> result = new ArrayList<>();
        int depth = 0;
        helper2(result,root,depth);
        return result;
    }
    static void helper2(ArrayList<Integer> result, Node root, int depth){
        if(root == null) return;
        if (depth == result.size()) result.add(root.key);
        helper2(result,root.left,depth+1);
        helper2(result,root.right,depth+1);
    }
    public static void main(String[] args) {
        RightAndLeftView tree = new RightAndLeftView();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        System.out.println(rightView(tree.root));
        System.out.println(leftView(tree.root));
    }
}
