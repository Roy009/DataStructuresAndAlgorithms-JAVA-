package Trees;

import java.util.*;

public class TopView {
    private Node root;
    private static class Node{
        int key;
        Node left,right;
        Node(int key){
            this.key = key;
            this.left = this.right = null;
        }
    }
    static ArrayList<Integer> topView(Node root){
        class Pair{
            int hd;
            Node node;
            Pair(int hd, Node node){
                this.hd = hd;
                this.node = node;
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        Map<Integer, Integer> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();
        if(root == null) return ans;
        q.add(new Pair(0,root));
        while(!q.isEmpty()){
            Pair it = q.remove();
            int hd = it.hd;
            Node temp = it.node;
            if(map.get(hd) == null) map.put(hd,temp.key);
            if(temp.left != null) {
                q.add(new Pair(hd-1,temp.left));
            }
            if(temp.right != null) {
                q.add(new Pair(hd+1,temp.right));
            }
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            ans.add(entry.getValue());
        }
        return ans;
    }
    public static void main(String[] args) {
        TopView tree = new TopView();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.right = new Node(4);
        tree.root.left.right.right = new Node(5);
        tree.root.left.right.right.right = new Node(6);
        System.out.println(tree.topView(tree.root));
    }
}
