package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
    static class Node{
        int data;
        int min, max;
    }
    static boolean levelOrderIsBST(int arr[], int n){
        if (n == 0)
            return true;
        Queue<Node> q = new LinkedList<Node>();
        int i = 0;
        Node newNode = new Node();
        newNode.data = arr[i++];
        newNode.min = Integer.MIN_VALUE;
        newNode.max = Integer.MAX_VALUE;
        q.add(newNode);
        while (i != n && q.size() > 0) {
            Node temp = q.peek();
            q.remove();
            newNode = new Node();
            if (i < n && (arr[i] < (int)temp.data && arr[i] > (int)temp.min)){
                newNode.data = arr[i++];
                newNode.min = temp.min;
                newNode.max = temp.data;
                q.add(newNode);
            }
            newNode = new Node();

            if (i < n && (arr[i] > (int)temp.data && arr[i] < (int)temp.max)){
                newNode.data = arr[i++];
                newNode.min = temp.data;
                newNode.max = temp.max;
                q.add(newNode);
            }
        }
        if (i == n)
            return true;
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {7,4,12,3,6,8,1,5,10};
        int n = arr.length;
        if (levelOrderIsBST(arr, n)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
