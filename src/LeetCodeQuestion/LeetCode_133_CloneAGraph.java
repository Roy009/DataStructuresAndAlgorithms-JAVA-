package LeetCodeQuestion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LeetCode_133_CloneAGraph {
    static class Node {
        public int val;
        public List<Node> neighbors;
        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }
    public static Node cloneGraph(Node node) {
        HashMap<Integer, Node> map = new HashMap<>();
        return clone(node, map);
    }

    public static Node clone(Node node, HashMap<Integer, Node> map){
        if(node == null) {
            return null;
        }

        if(map.containsKey(node.val)){
            return map.get(node.val);
        }

        Node newNode = new Node(node.val, new ArrayList<Node>());
        map.put(newNode.val, newNode);
        for(Node neighbor : node.neighbors){
            newNode.neighbors.add(clone(neighbor, map));
        }
        return newNode;
    }

    public static void main(String[] args) {

    }
}
