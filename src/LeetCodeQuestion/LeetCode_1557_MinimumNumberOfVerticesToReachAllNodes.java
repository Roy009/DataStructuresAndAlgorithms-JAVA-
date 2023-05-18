package LeetCodeQuestion;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_1557_MinimumNumberOfVerticesToReachAllNodes {

    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    public static List<Integer> minimumVertices(int n, ArrayList<ArrayList<Integer>> edges){
        boolean[] isExists = new boolean[n];
        for (List<Integer> edge : edges) {
            isExists[edge.get(1)] = true;
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (!isExists[i]){
                result.add(i);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int n = 6;
        ArrayList<ArrayList<Integer>> edges = new ArrayList<>();
        addEdge(edges,0,1);
        addEdge(edges,0,2);
        addEdge(edges,2,5);
        addEdge(edges,3,4);
        addEdge(edges,4,2);
        System.out.println(edges);
    }
}
