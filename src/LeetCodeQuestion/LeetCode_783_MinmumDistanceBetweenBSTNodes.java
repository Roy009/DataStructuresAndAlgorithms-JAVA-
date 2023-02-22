package LeetCodeQuestion;

import Trees.BinaryTree.Binarytree;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_783_MinmumDistanceBetweenBSTNodes {
    private Node root;
    static List<Integer> ans = new ArrayList<>();
    private static class Node {
        int key;
        Node left, right;

        Node(int key) {
            this.key = key;
            this.left = this.right = null;
        }
    }
    static void inorder(Node root){
        if(root == null) return;
        inorder(root.left);
        ans.add(root.key);
        inorder(root.right);
    }
    public static int minDiffInBST(Node root) {
        inorder(root);
        int diff = Integer.MAX_VALUE;
        for(int i = 1; i < ans.size(); i++){
            diff = Math.min(diff, ans.get(i) - ans.get(i-1));
        }
        return diff;
    }
    public static void main(String[] args) {
        LeetCode_783_MinmumDistanceBetweenBSTNodes tree = new LeetCode_783_MinmumDistanceBetweenBSTNodes();
        tree.root = new Node(4);
        tree.root.left = new Node(2);
        tree.root.right = new Node(6);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(3);
        System.out.println(minDiffInBST(tree.root));
    }
}
