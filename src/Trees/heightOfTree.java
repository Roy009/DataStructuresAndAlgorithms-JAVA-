package Trees;

public class heightOfTree {
    private Node root;
    private static class Node{
        int key;
        Node left, right;
        Node(int k){
            key = k;
            left = right = null;
        }
    }
    heightOfTree(){
        root = null;
    }
    int maxDepth(Node node){
        if (node == null)
            return 0;
        int ldepth = maxDepth(node.left);
        int rdepth = maxDepth(node.right);
        if (ldepth > rdepth)
            return (ldepth + 1);
        else
            return (rdepth + 1);
    }
    int maxDepth(){
        return maxDepth(root);
    }
    public static void main(String[] args) {
        heightOfTree ht = new heightOfTree();
        ht.root = new Node(1);
        ht.root.left = new Node(2);
        ht.root.right = new Node(3);
        ht.root.left.left = new Node(4);
        ht.root.left.right = new Node(5);
        ht.root.right.right = new Node(6);
        ht.root.right.right.left = new Node(7);
        ht.root.right.right.right = new Node(8);



        System.out.println("Maximum Depth of the tree is " + ht.maxDepth());
    }
}
