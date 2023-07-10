package LeetCodeQuestion;

import java.util.LinkedList;
import java.util.Queue;

public class LeetCode_111_MinimumDepthOfBinaryTree {
    static Node root;
    static class Node{
        int data;
        Node left, right;
        Node(int d){
            data = d;
            left = right = null;
        }
    }
    public static int minimumDepth(Node root){
        if (root == null) return 0;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int depth = 1;
        while (!q.isEmpty()){
            int Qsize = q.size();
            while (Qsize > 0){
                Qsize--;
                Node node = q.remove();
                if (node == null) continue;
                if(node.left == null && node.right == null){
                    return depth;
                }
                q.add(node.left);
                q.add(node.right);
            }
            depth++;
        }
        return -1;
    }
    public static void main(String[] args) {
        LeetCode_111_MinimumDepthOfBinaryTree tree = new LeetCode_111_MinimumDepthOfBinaryTree();
        tree.root = new Node(3);
        tree.root.left = new Node(9);
        tree.root.right = new Node(20);
        tree.root.right.left = new Node(15);
        tree.root.right.right = new Node(7);
        System.out.println(minimumDepth(root));
    }
}
