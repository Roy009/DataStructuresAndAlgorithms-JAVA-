package LeetCodeQuestion;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_530_MInimumAbsoluteDifferenceInBST {
    private static Node root;
    static List<Integer> list = new ArrayList<>();
    static class Node {
        int val;
        Node left, right;
        Node(int val) {
            this.val = val;
            this.left = this.right = null;
        }
    }
    public static int getMinimumDifference(Node root){
        inOrderTraversal(root);
        int minDiff = Integer.MAX_VALUE;
        for (int i = 1; i < list.size(); i++) {
            minDiff = Math.min(minDiff, list.get(i) - list.get(i-1));
        }
        return minDiff;
    }
    static void inOrderTraversal(Node node){
        if (node == null) return;
        inOrderTraversal(node.left);
        list.add(node.val);
        inOrderTraversal(node.right);
    }
    public static void main(String[] args) {
        root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(6);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        System.out.println(getMinimumDifference(root));
    }
}
