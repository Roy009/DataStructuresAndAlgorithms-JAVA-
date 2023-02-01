package Trees.BinaryTree;

public class LCAOfATree {
    private Node root;
    private static class Node{
        int key;
        Node left, right;
        Node(int k){
            key = k;
            left = right = null;
        }
    }
    static public Node lowestCommonAncestor(Node root, Node p, Node q) {
        if(root == null || root == p || root == q){
            return root;
        }
        Node left = lowestCommonAncestor(root.left,p,q);
        Node right = lowestCommonAncestor(root.right,p,q);
        if(left == null){
            return right;
        }else if(right == null){
            return left;
        }else{
            return root;
        }
    }
    public static void main(String[] args) {
        LCAOfATree lca = new LCAOfATree();
        lca.root = new Node(1);
        lca.root.left = new Node(2);
        lca.root.right = new Node(3);
        lca.root.left.left = new Node(4);
        lca.root.left.right = new Node(5);
        lca.root.right.left = new Node(6);
        lca.root.right.right = new Node(7);
        Node result = lowestCommonAncestor(lca.root,lca.root.left.left,lca.root.left.right);
        System.out.println(result.key);
    }
}
