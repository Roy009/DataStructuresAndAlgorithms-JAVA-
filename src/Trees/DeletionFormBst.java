package Trees;

public class DeletionFormBst {
    class Node{
        int key;
        Node left, right;
        Node(int d){
            key = d;
            left = right = null;
        }
    }
    Node root;
    DeletionFormBst(){
        root = null;
    }
    void deleteKey(int key){
        root = deleteRec(root,key);
    }
    Node deleteRec(Node root, int key){
        if (root == null){
            return root;
        }
        if (key < root.key){
            root.left = deleteRec(root.left, key);
        } else if(key > root.key) {
            root.right = deleteRec(root.right, key);
        } else {
            if (root.left == null){
                return root.right;
            } else if (root.right == null){
                return root.left;
            }
            root.key = minValue(root.right);
            root.right = deleteRec(root.right, root.key);
        }
        return root;
    }
    int minValue(Node root){
        int minv = root.key;
        while (root.left != null){
            minv = root.left.key;
            root = root.left;
        }
        return minv;
    }
    void insert(int key){
        root = insertRec(root, key);
    }
    Node insertRec(Node root, int key){
        if (root == null){
            root = new Node(key);
            return root;
        }
        if (key < root.key){
            root.left = insertRec(root.left, key);
        } else if(key > root.key) {
            root.right = insertRec(root.right,key);
        }
        return root;
    }
    void inOrder(){
        inOrderRec(root);
    }
    void inOrderRec(Node root){
        if (root != null) {
            inOrderRec(root.left);
            System.out.print(root.key + " ");
            inOrderRec(root.right);
        }
    }
    public static void main(String[] args) {
        DeletionFormBst tree = new DeletionFormBst();

        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        System.out.println("Inorder Traversal of the Tree");
        tree.inOrder();
        System.out.println("Deleting the Node 20");
        tree.deleteKey(20);
        System.out.println("Inorder Traversal after Deleting a Node");
        tree.inOrder();
        System.out.println("Deleting the Node 30");
        tree.deleteKey(30);
        System.out.println("Inorder Traversal after Deleting a Node");
        tree.inOrder();
        System.out.println("Deleting the Node 50");
        tree.deleteKey(50);
        System.out.println("Inorder Traversal after Deleting a Node");
        tree.inOrder();
    }
}
