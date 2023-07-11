package LeetCodeQuestion;

import java.util.*;

public class LeetCode_863_AllNodesDistanceKInBinaryTree {
    static Node root;
    static class Node{
        int data;
        Node left, right;
        Node(int d){
            data = d;
            left = right = null;
        }
    }
    static Map<Integer, List<Integer>> graph;
   static List<Integer> answer;
    static Set<Integer> visited;
    public static List<Integer> distanceK(Node root, Node target, int k) {
        graph = new HashMap<>();
        buildGraph(root, null);
        answer = new ArrayList<>();
        visited = new HashSet<>();
        visited.add(target.data);
        dfs(target.data, 0, k);
        return answer;
    }
    private static void buildGraph(Node cur, Node parent) {
        if (cur != null && parent != null) {
            graph.computeIfAbsent(cur.data, k -> new ArrayList<>()).add(parent.data);
            graph.computeIfAbsent(parent.data, k -> new ArrayList<>()).add(cur.data);
        }
        if (cur.left != null) {
            buildGraph(cur.left, cur);
        }
        if (cur.right != null) {
            buildGraph(cur.right, cur);
        }
    }
    private static void dfs(int cur, int distance, int k) {
        if (distance == k) {
            answer.add(cur);
            return;
        }
        for (int neighbor : graph.getOrDefault(cur, new ArrayList<>())) {
            if (!visited.contains(neighbor)) {
                visited.add(neighbor);
                dfs(neighbor, distance + 1, k);
            }
        }
    }
    public static void main(String[] args) {
        LeetCode_863_AllNodesDistanceKInBinaryTree tree = new LeetCode_863_AllNodesDistanceKInBinaryTree();
        tree.root = new Node(3);
        root.left = new Node(5);
        root.right = new Node(1);
        root.left.left = new Node(6);
        root.left.right = new Node(2);
        root.left.right.left = new Node(7);
        root.left.right.right = new Node(4);
        root.right.left = new Node(0);
        root.right.right = new Node(8);
        System.out.println(distanceK(root,new Node(5),2));
    }
}
