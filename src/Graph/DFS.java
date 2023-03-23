package Graph;

import java.util.ArrayList;
import java.util.LinkedList;

public class DFS {
    public static void dfs(int node, boolean[] visited, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> list){
        visited[node] = true;
        list.add(node);
        for (Integer i: adj.get(node)) {
            if (visited[i] == false){
                dfs(i,visited,adj,list);
            }
        }
    }
    public static ArrayList<Integer> dfsUtil(int v, ArrayList<ArrayList<Integer>> adj){
        boolean[] visited = new boolean[v+1];
        visited[0] = true;
        ArrayList<Integer> list = new ArrayList<>();
        dfs(0,visited,adj,list);
        return list;
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(2);
        adj.get(2).add(0);
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(0).add(3);
        adj.get(3).add(0);
        adj.get(2).add(4);
        adj.get(4).add(2);
        ArrayList<Integer> ans = new ArrayList<>();
        ans = dfsUtil(5,adj);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }
}
