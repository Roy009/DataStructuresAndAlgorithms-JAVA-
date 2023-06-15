package LeetCodeQuestion;

import java.util.LinkedList;
import java.util.Queue;

public class LeetCode_1161_MaximumLevelSumOfABinaryTree {
    private static Node root;
    static class Node {
        int val;
        Node left, right;
        Node(int val) {
            this.val = val;
            this.left = this.right = null;
        }
    }
    public static int maximumLevelSum(Node root){
        if (root == null) return 0;
        Queue<Node> queue = new LinkedList<>();
        int maxSum = Integer.MIN_VALUE;
        int level = 0, ans = 0;
        queue.add(root);
        while(!queue.isEmpty()){
            level++;
            int sum = 0;
            for (int i = queue.size(); i > 0; --i) {
                Node temp = queue.poll();
                sum += temp.val;
                if (temp.left != null) queue.add(temp.left);
                if (temp.right != null) queue.add(temp.right);
            }
            if (maxSum < sum){
                maxSum = sum;
                ans = level;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        root = new Node(1);
        root.left = new Node(7);
        root.right = new Node(0);
        root.left.left = new Node(7);
        root.left.right = new Node(-8);
        System.out.println(maximumLevelSum(root));
    }
}
