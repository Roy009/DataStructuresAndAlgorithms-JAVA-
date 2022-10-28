package Trees;

public class kDistanceFromRoot {
    private Node root;
    private static class Node{
        int key;
        Node left, right;
        Node(int k){
            key = k;
            left = right = null;
        }
    }
    kDistanceFromRoot(){
        root = null;
    }
    void printKDistance(Node node, int k){
        if (node == null || k < 0)
            return;
        if (k == 0){
            System.out.print(node.key + " ");
        }
        printKDistance(node.left,k - 1);
        printKDistance(node.right, k - 1);
    }
    public static void main(String[] args) {
        kDistanceFromRoot kd = new kDistanceFromRoot();
        kd.root = new Node(1);
        kd.root.left = new Node(2);
        kd.root.right = new Node(3);
        kd.root.left.left = new Node(4);
        kd.root.left.right = new Node(5);
        System.out.print("The distance from node 2 is ");
        kd.printKDistance(kd.root,2);
    }
}
