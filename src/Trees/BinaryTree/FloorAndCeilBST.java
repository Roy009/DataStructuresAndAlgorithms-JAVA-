package Trees.BinaryTree;

public class FloorAndCeilBST {
    static class Node{
        int key;
        Node left, right;
        Node(int d){
            key = d;
            left = right = null;
        }
    }
    Node root;
    FloorAndCeilBST(){
        root = null;
    }
    int Ceil(Node node, int input){
        // if the node null is then return -1
        if (node == null){
            return -1;
        }
        // if the data of the node is equal to the input
        if (node.key == input){
            return node.key;
        }
        // if the input is greater than the node data then traverse the right subtree
        if (node.key < input) {
            return Ceil(node.right, input);
        }
        // other-wise traverse the left subtree
        int ceil = Ceil(node.left, input);
        return (ceil >= input) ? ceil : node.key;
    }
    int floor(Node node, int input){
        if (node == null)
            return -1;
        if (node.key == input)
            return node.key;
        if (node.key > input) {
            return floor(node.left, input);
        } else {
            int Floor = floor(node.right, input);
            return (Floor <= input && Floor != 1) ? Floor : node.key;
        }
    }
    public static void main(String[] args) {
        FloorAndCeilBST tree = new FloorAndCeilBST();
        tree.root = new Node(8);
        tree.root.left = new Node(4);
        tree.root.right = new Node(12);
        tree.root.left.left = new Node(2);
        tree.root.left.right = new Node(6);
        tree.root.right.left = new Node(10);
        tree.root.right.right = new Node(14);
        System.out.println("Floor values");
        for (int i = 0; i < 10; i++) {
            System.out.println(i+ " " + tree.floor(tree.root, i));
        }
        System.out.println("Ceiling values");
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " " + tree.Ceil(tree.root, i));
        }

    }
}
