package Trees.BinaryTree;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        data = data;
        left = right = null;
    }
}
public class IdenticalTrees {
    Node root;
    public static boolean isIdentical(Node n1, Node n2){
        // if both the nodes of the trees are null then they are identical this is the base condition
        if (n1 == null && n2 == null){
            return true;
        }
        if (n1 != null && n2 != null){
            return (isIdentical(n1.left, n2.left) && isIdentical(n1.right, n2.right));
        }
        return false;
    }

    public static void main(String[] args) {

        // Tree - 1

        //  1
        // / \
        // 2 3

        IdenticalTrees tree1 = new IdenticalTrees();
        tree1.root = new Node(1);
        tree1.root.left = new Node(2);
        tree1.root.right = new Node(3);

        // Tree - 2

        //  1
        // / \
        // 2 3

        IdenticalTrees tree2 = new IdenticalTrees();
        tree2.root = new Node(1);
        tree2.root.left = new Node(2);
        tree2.root.right = new Node(3);

        System.out.println(isIdentical(tree1.root, tree2.root));
    }
}
