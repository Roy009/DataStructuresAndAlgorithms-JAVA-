package Trees.BinaryTree;

public class printAncestors {
    private Node root;
    private static class Node{
        int key;
        Node left, right;
        Node(int k){
            key = k;
            left = right = null;
        }
    }
    printAncestors(){root = null;}
    boolean printAncestorsOfANode(Node node, int target){
        if (node == null)
            return false;
        if (node.key == target){
            return true;
        }
        if (printAncestorsOfANode(node.left,target) || printAncestorsOfANode(node.right, target)){
            System.out.print(node.key + " ");
        }
        return false;
    }
    public static void main(String[] args) {
        printAncestors pa = new printAncestors();
        pa.root = new Node(1);
        pa.root.left = new Node(2);
        pa.root.right = new Node(3);
        pa.root.left.left = new Node(4);
        pa.root.left.right = new Node(5);
        pa.root.left.left.left = new Node(6);
        pa.printAncestorsOfANode(pa.root, 6);
    }
}
