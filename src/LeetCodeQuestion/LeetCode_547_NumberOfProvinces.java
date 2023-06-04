package LeetCodeQuestion;

public class LeetCode_547_NumberOfProvinces {
    static int len;
    public static int findCircleNum(int[][] isConnected) {
        len = isConnected.length;
        int count = 0;
        boolean[] check = new boolean[len];
        for(int i = 0; i < len; i++){
            if(!check[i]){
                count++;
                helper(isConnected, check, i);
            }
        }
        return count;
    }
    static void helper(int[][] isConnected, boolean[] check, int i){
        check[i] = true;
        for(int j = 0; j < len; j++){
            if(!check[j] && isConnected[i][j] == 1) helper(isConnected, check, j);
        }
    }
    public static void main(String[] args) {
        int[][] isConnected = {{1,1,0},{1,1,0},{0,0,1}};
        System.out.println(findCircleNum(isConnected));
    }
}
