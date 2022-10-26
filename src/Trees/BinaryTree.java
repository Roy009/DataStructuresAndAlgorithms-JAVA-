package Trees;
public class BinaryTree {
   private Node root;
   private static class Node{
       int key;
       Node left,right;
       Node(int key){
           this.key = key;
           this.left = this.right = null;
       }
   }
   void inOrderTraversal(Node node){
       if (node == null)
           return;
       inOrderTraversal(node.left);
       System.out.print(node.key + " ");
       inOrderTraversal(node.right);
   }
   void inOrderTraversal(){
       inOrderTraversal(root);
       System.out.println();
   }
   void preOrderTraversal(Node node){
       if (node == null){
           return;
       }
       System.out.print(node.key + " ");
       preOrderTraversal(node.left);
       preOrderTraversal(node.right);
   }
   void preOrderTraversal(){
       preOrderTraversal(root);
       System.out.println();
   }
   void postorderTraversal(Node node){
       if (node == null){
           return;
       }
       postorderTraversal(node.left);
       postorderTraversal(node.right);
       System.out.print(node.key + " ");
   }
   void postorderTraversal(){
       postorderTraversal(root);
   }
    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
//         Tree
//           1
//         /  \
//        2   3
//       / \ / \
//      4  5 6 7

        System.out.println("In-Order Traversal");
        tree.inOrderTraversal();
        System.out.println("Pre-Order Traversal");
        tree.preOrderTraversal();
        System.out.println("Post order Traversal");
        tree.postorderTraversal();
    }
}
