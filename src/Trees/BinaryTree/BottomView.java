package Trees.BinaryTree;

import java.util.*;

public class BottomView {
    private Node root;
    static class Node{
        int data;
        int hd;
        Node left,right;
        Node(int data){
            this.hd = Integer.MIN_VALUE;
            this.data = data;
            this.left = this.right = null;
        }
    }
    static public ArrayList <Integer> bottomView(Node root)
    {
        // Code here
        ArrayList<Integer> ans = new ArrayList<Integer>();
        if(root == null) return ans;
        Queue<Node> q = new LinkedList<Node>();
        Map<Integer,Integer> map = new TreeMap<>();
        root.hd = 0;
        q.add(root);
        while(!q.isEmpty()){
            Node temp = q.remove();
            int hd = temp.hd;
            map.put(hd,temp.data);
            if(temp.left != null) {
                temp.left.hd = hd - 1;
                q.add(temp.left);
            }
            if(temp.right != null) {
                temp.right.hd = hd + 1;
                q.add(temp.right);
            }
        }

        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            ans.add(entry.getValue());
        }
        return ans;
    }
    public static void main(String[] args) {
        BottomView tree = new BottomView();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.right = new Node(4);
        tree.root.left.right.right = new Node(5);
        tree.root.left.right.right.right = new Node(6);
        System.out.println(tree.bottomView(tree.root));
    }
}
