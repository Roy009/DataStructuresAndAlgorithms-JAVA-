package Trees.BinaryTree;

import java.util.HashMap;
import java.util.Map;

public class BuildTreeWithInorderAndPreOrderTraversal {
    static class Node{
        int val;
        Node left,right;
        Node(int val){
            val = val;
            left = right = null;
        }
    }
    public static Node buildTree(int[] preorder, int[] inorder){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        Node root = helper(preorder,0, preorder.length-1,inorder,0, inorder.length-1,map);
        return root;
    }
    public static Node helper(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd, Map<Integer,Integer> map){
        if (preStart > preEnd || inStart > inEnd) return null;
        Node root = new Node(preorder[preStart]);
        int inRoot = map.get(root.val);
        int numsLeft = inRoot - inStart;
        root.left = helper(preorder,preStart+1,preStart+numsLeft,inorder,inStart,inRoot-1,map);
        root.right = helper(preorder,preStart+numsLeft+1,preEnd,inorder,inRoot+1,inEnd,map);
        return root;
    }
    public static void main(String[] args) {
        int preorder[] = {10,20,40,50,30,60};
        int inorder[] = {40,20,50,10,60,30};
        Node root = buildTree(preorder, inorder);
        System.out.println(root.val);
    }
}
