package Trees;

public class SumOfElementsKDistance {
    private Node root;
    private static class Node{
        int key;
        Node left, right;
        Node(int k){
            key = k;
            left = right = null;
        }
    }
    static int sumOfElementsInKDistance(Node node, int k){
        if(node == null) return 0;
        int sum = 0;
        if(k==0) return node.key;
        sum += sumOfElementsInKDistance(node.left,k-1);
        sum += sumOfElementsInKDistance(node.right,k-1);
        return sum;
    }
    public static void main(String[] args) {
        SumOfElementsKDistance s = new SumOfElementsKDistance();
        s.root = new Node(1);
        s.root.left = new Node(2);
        s.root.right = new Node(3);
        s.root.left.left = new Node(4);
        s.root.left.right = new Node(5);
        System.out.println(sumOfElementsInKDistance(s.root,2));
    }
}
