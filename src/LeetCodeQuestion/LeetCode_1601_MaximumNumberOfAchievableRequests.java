package LeetCodeQuestion;

public class LeetCode_1601_MaximumNumberOfAchievableRequests {
    static int ans = 0;
    public static void helper(int[][] requests, int[] indegree, int n, int index, int count){
        if(index == requests.length){
            for (int i = 0; i < n; i++) {
                if(indegree[i] != 0){
                    return;
                }
            }
            ans = Math.max(ans, count);
            return;
        }
        indegree[requests[index][0]]--;
        indegree[requests[index][1]]++;
        helper(requests,indegree,n,index + 1, count + 1);
        indegree[requests[index][0]]++;
        indegree[requests[index][1]]--;
        helper(requests,indegree,n,index + 1, count);
    }
    public static int maximumRequests(int n, int[][] requests){
        int[] indegree = new int[n];
        helper(requests,indegree,n,0,0);
        return ans;
    }

    public static void main(String[] args) {
        int[][] requests = {{0,0},{1,2},{2,1}};
        int n = 3;
        System.out.println(maximumRequests(n, requests));
    }
}
