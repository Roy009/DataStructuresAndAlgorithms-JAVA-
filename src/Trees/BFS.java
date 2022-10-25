package Trees;

public class BFS {
    private Node root;
    BFS(){
        root = null;
    }
    private static class Node{
        int key;
        Node left, right;
        Node(int k){
            key = k;
            left = right = null;
        }
    }
    int height(Node root){
        if (root == null){
            return 0;
        }else {
            int lheight = height(root.left);
            int rheight = height(root.right);
            if (lheight >= rheight)
                return (lheight + 1);
            else
                return (rheight + 1);
        }
    }
    void printCurrentLevel(Node root, int level){
        if (root == null){
            return;
        }
        if (level == 1){
            System.out.print(root.key + " ");
        }
        else if (level > 1){
            printCurrentLevel(root.left, level - 1);
            printCurrentLevel(root.right, level - 1);
        }
    }
    void printLevel(){
        int h = height(root);
        int i;
        for (i = 1; i <= h; i++) {
            printCurrentLevel(root,i);
        }
    }
    public static void main(String[] args) {
        BFS tree = new BFS();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        System.out.println("Level order Traversal of the Tree");
        tree.printLevel();
    }
}
