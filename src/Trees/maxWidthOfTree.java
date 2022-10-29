package Trees;

public class maxWidthOfTree {
    private Node root;

    private static class Node{
        int key;
        Node left, right;
        Node(int k){
            key = k;
            left = right = null;
        }
    }
    maxWidthOfTree(){ root = null; }
    int height(Node node){
        if (node == null){
            return 0;
        } else {
            int lHeight = height(node.left);
            int rHeight = height(node.right);
            return (lHeight > rHeight) ? (lHeight + 1) : (rHeight + 1);
        }
    }
    int getMaxWidth(Node node){
        int maxWidth = 0;
        int width;
        int h = height(node);
        int i;
        for (i = 1; i <= h; i++){
            width = getWidth(node, i);
            if (width > maxWidth)
                maxWidth = width;
        }
        return maxWidth;
    }
    int getWidth(Node node, int level){
        if(node == null){
            return 0;
        }
        if (level == 1)
            return 1;
        else if (level > 1)
            return getWidth(node.left, level - 1) + getWidth(node.right, level - 1);
        return 0;
    }
    public static void main(String[] args) {
        maxWidthOfTree mt = new maxWidthOfTree();
        mt.root = new Node(1);
        mt.root.left = new Node(2);
        mt.root.right = new Node(3);
        mt.root.left.left = new Node(4);
        mt.root.left.right = new Node(5);
        mt.root.right.right = new Node(8);
        mt.root.right.right.left  = new Node(6);
        mt.root.right.right.right = new Node(7);
        System.out.println("Maximum width is " + mt.getMaxWidth(mt.root));

    }
}
