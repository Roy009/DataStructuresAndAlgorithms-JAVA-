package LeetCodeQuestion;

public class LeetCode_623_AddOneRowToTree {
    private static Node root;
    public static class Node{
        Node left, right;
        int val;
        Node(int val){
            root.val = val;
            root.left = root.right = null;
        }
    }
    public static Node addOneRow(Node root, int val, int depth){
        if(depth == 1){
            Node newRoot = new Node(val);
            newRoot.left = root;
            return newRoot;
        }
        return add(root, val, depth, 1);
    }
    public static Node add(Node root, int val, int depth, int curr){
        if(root == null) return null;

        if(curr == depth - 1){
            Node lTemp = root.left;
            Node rTemp = root.right;

            root.left = new Node(val);
            root.right = new Node(val);
            root.left.left = lTemp;
            root.right.right = rTemp;

            return root;
        }
        root.left = add(root.left, val, depth, curr+1);
        root.right = add(root.right, val, depth, curr+1);

        return root;
    }
    public static void main(String[] args) {

    }
}
