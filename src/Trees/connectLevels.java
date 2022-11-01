package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class connectLevels {
    private static Node root;
    private static class Node{
        int key;
        Node left, right, nextRight;
        Node(int k){
            key = k;
            left = right = nextRight = null;
        }
    }
    connectLevels(){
        root = null;
    }
    void connect(Node node){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        Node temp = null;
        while (!q.isEmpty()){
            int n = q.size();
            for (int i = 0; i < n; i++) {
                Node prev =temp;
                temp = q.poll();

                if (i > 0)
                    prev.nextRight = temp;
                if (temp.left != null)
                    q.add(temp.left);
                if (temp.right != null)
                    q.add(temp.right);
            }
            temp.nextRight = null;
        }
    }
    public static void main(String[] args) {
        connectLevels tree = new connectLevels();

        root = new Node(10);
        root.left = new Node(8);
        root.right = new Node(2);
        root.left.left = new Node(3);
        tree.connect(root);
        System.out.print(
                "nextRight of " + root.key + " is "
                        + (root.nextRight != null ? root.nextRight.key
                        : -1)
                        + "\n");
        System.out.print("nextRight of " + root.left.key
                + " is "
                + (root.left.nextRight != null
                ? root.left.nextRight.key
                : -1)
                + "\n");
        System.out.print("nextRight of " + root.right.key
                + " is "
                + (root.right.nextRight != null
                ? root.right.nextRight.key
                : -1)
                + "\n");
        System.out.print(
                "nextRight of " + root.left.left.key + " is "
                        + (root.left.left.nextRight != null
                        ? root.left.left.nextRight.key
                        : -1)
                        + "\n");
    }
}
