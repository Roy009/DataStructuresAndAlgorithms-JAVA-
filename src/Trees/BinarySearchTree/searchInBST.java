package Trees.BinarySearchTree;

public class searchInBST {
    private static class Node{
        int key;
        Node left, right;
        Node(int d){
            key = d;
            left = right = null;
        }
    }
    private Node root;
    searchInBST(){ root = null; }
    searchInBST(int value){ root = new Node(value); }
    void insert(int key) { root = insertRec(root,key);}
    Node insertRec(Node root, int key){
        if (root == null) {
            root = new Node(key);
            return root;
        } else if (key < root.key){
            root.left = insertRec(root.left, key);
        } else if (key > root.key) {
            root.right = insertRec(root.right, key);
        }
        return root;
    }
    void inorder(){ inorderRec(root);}
    void inorderRec(Node root){
        if (root!= null){
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }
    Node search(Node root, int key){
        if (root == null || root.key == key)
            return root;
        if (root.key < key)
            return search(root.right, key);
        return search(root.left,key);
    }
    public static void main(String[] args) {
        searchInBST tree = new searchInBST();
        tree.insert(5);
        tree.insert(3);
        tree.insert(2);
        tree.insert(4);
        tree.insert(7);
        tree.insert(6);
        tree.insert(8);

        tree.inorder();
        System.out.println("");
        System.out.println("Element " + tree.search(tree.root, 3).key);
    }
}
