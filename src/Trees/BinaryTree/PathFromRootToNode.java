package Trees.BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class PathFromRootToNode {
    Node root;
    private static class Node{
        int data;
        Node left, right;
        Node(int data){
            data = data;
            left = right = null;
        }
    }
//    static ArrayList<Integer> path = new ArrayList<>();
//    static List<Integer> printPath(Node root, int x){
//        getPath(root,path,x);
//        return path;
//    }
    static boolean getPath(Node root, ArrayList<Integer> path, int x){
        if (root == null) return false;
        path.add(root.data);
        if (root.data == x) return true;
        if (getPath(root.left,path,x) || getPath(root.right, path, x)){
            return true;
        }
        path.remove(path.size() - 1);
        return false;
    }
    public static void main(String[] args) {
        PathFromRootToNode tree = new PathFromRootToNode();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        ArrayList<Integer> ans = new ArrayList<>();
        getPath(tree.root,ans,7);
//        System.out.println(getPath(tree.root,ans,4));
        for (int it: ans) {
            System.out.print(it + " ");
        }
    }
}
