package Trees;

public class findPreSuc {
    static class Node{
        int key;
        Node left, right;
        Node(int k){
            key = k;
            left = right = null;
        }
        Node(){}
    }
    Node root;
    findPreSuc(){
        root = null;
    }
    static Node suc = null, pre = null;
    static void findSucPre(Node root, int key){
        if (root == null)
            return;
        if (root.key == key){
            if (root.left != null){
                Node temp = root.left;
                while (temp.right != null){
                    temp = temp.left;
                }
                pre = temp;
            }
            if (root.right != null){
                Node temp = root.right;
                while(temp.left != null){
                    temp = temp.left;
                }
                // successor
                suc = temp;
            }
            return;
        }
        if (root.key > key){
            suc = root;
            findSucPre(root.left,key);
        } else {
            pre = root;
            findSucPre(root.right,key);
        }
    }
    static Node insert(Node node, int key){
        if (node == null)
            return new Node(key);
        if (key < node.key)
            node.left = insert(node.left,key);
        else
            node.right = insert(node.right,key);
        return node;
    }
    public static void main(String[] args) {
        int key = 65;
        Node root = new Node();
        root = insert(root,50);
        insert(root, 30);
        insert(root, 20);
        insert(root, 40);
        insert(root, 70);
        insert(root, 60);
        insert(root, 80);

        findSucPre(root,key);
        if (pre!= null){
            System.out.println("The Predecessor is " + pre.key);
        }else {
            System.out.println("No Predecessor");
        }
        if (suc != null)
            System.out.println("The Successor is " + suc.key);
        else
            System.out.println("No Successor");
    }
}
