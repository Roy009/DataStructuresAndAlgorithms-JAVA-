package Trees.BinaryTree;

import java.util.*;

public class DiagonalTraversal {
    private Node root;
    private static class Node{
        int key;
        Node left, right;
        Node(int k){
            key = k;
            left = right = null;
        }
    }
    static ArrayList<Integer> diagonalTraverse(Node root){
        ArrayList<Integer> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        Queue<Node> leftTurns = new LinkedList<>();
        Node node = root;
        while (node != null){
            result.add(node.key);
            if(node.left != null){
                leftTurns.add(node.left);
            }
            if(node.right != null){
                node = node.right;
            }else {
                if(!leftTurns.isEmpty()){
                    node = leftTurns.peek();
                    leftTurns.remove();
                }else{
                    node = null;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        DiagonalTraversal dt = new DiagonalTraversal();
        dt.root = new Node(1);
        dt.root.left = new Node(2);
        dt.root.right = new Node(3);
        dt.root.left.left = new Node(4);
        dt.root.left.right = new Node(5);
        dt.root.right.left = new Node(6);
        dt.root.right.right = new Node(7);
        dt.root.left.right.left = new Node(9);
        dt.root.right.left.left = new Node(10);
        System.out.println(diagonalTraverse(dt.root));
    }
}
