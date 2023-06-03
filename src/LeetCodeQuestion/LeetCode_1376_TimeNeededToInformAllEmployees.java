package LeetCodeQuestion;

import java.util.ArrayList;

public class LeetCode_1376_TimeNeededToInformAllEmployees {
    static int timeToSend = Integer.MIN_VALUE;
    static void DFS(ArrayList<ArrayList<Integer>> adjlist, int[] informTime, int curr, int time){
        timeToSend = Math.max(timeToSend, time);
        for(int adj : adjlist.get(curr)){
            DFS(adjlist, informTime, adj, time + informTime[curr]);
        }
    }
    public static int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        ArrayList<ArrayList<Integer>> adjlist = new ArrayList<ArrayList<Integer>>(n);
        for(int i  = 0; i < n; i++){
            adjlist.add(new ArrayList<Integer>());
        }
        for(int i = 0; i < n; i++){
            if(manager[i] != -1){
                adjlist.get(manager[i]).add(i);
            }
        }
        DFS(adjlist, informTime, headID, 0);
        return timeToSend;
    }
    public static void main(String[] args) {
        int n = 6;
        int headId = 2;
        int[] informTime = {0,0,1,0,0,0};
        int[] manager = {2,2,-1,2,2,2};
        System.out.println(numOfMinutes(n,headId,manager,informTime));
    }
}
