package Trees;

class Node{
    int key;
    Node right, left;

    public Node(int item){
        key = item;
        right = left = null;
    }
}
public class BinaryTree {

    Node root;

    BinaryTree(int key){
        root = new Node(key);
    }

    BinaryTree(){
        root = null;
    }

    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

    }
}
