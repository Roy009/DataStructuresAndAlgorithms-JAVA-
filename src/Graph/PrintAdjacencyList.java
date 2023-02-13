package Graph;

import java.util.ArrayList;

public class PrintAdjacencyList {
    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    static void printGraph(ArrayList<ArrayList<Integer>> adj){
        for (int i = 0; i < adj.size(); i++) {
            System.out.println("Adjacency list of vertex " + i);
            System.out.print("head ");
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print("-> " + adj.get(i).get(j));
            }
            System.out.println();
        }
    }
    static boolean str(String s, String ans){
        int n = s.length();
        int i = 0;
        int j = 0;
        int count = 0;
        while(i<n) {
            if(s.charAt(j) == ans.charAt(i)){
                i++;
                j++;
                count++;
            }else{
                i++;
            }
        }
        if (j == s.length()){

        }
        return false;
    }
    public static void main(String[] args) {
//        int v = 5;
//        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
//        for (int i = 0; i < v; i++) {
//            adj.add(new ArrayList<Integer>());
//        }
//        addEdge(adj,0,1);
//        addEdge(adj,0,4);
//        addEdge(adj,1,2);
//        addEdge(adj,1,3);
//        addEdge(adj,1,4);
//        addEdge(adj,2,3);
//        addEdge(adj,3,4);
//        printGraph(adj);
        boolean ans = str("hello","ahhellllloou");
        System.out.println(ans);
    }
}
