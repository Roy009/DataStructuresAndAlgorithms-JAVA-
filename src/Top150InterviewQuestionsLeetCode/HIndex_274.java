package Top150InterviewQuestionsLeetCode;

public class HIndex_274 {
    public static int findHIndex(int[] citations){
        int n = citations.length;
        int[] bucket = new int[n+1];
        for (int c : citations){
            if (c >= n){
                bucket[n]++;
            }else{
                bucket[c]++;
            }
        }
        int count = 0;
        for (int i = n; i > 0 ; i--) {
            count += bucket[i];
            if (count >= i){
                return i;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] citation = {3,0,6,1,5};
        System.out.println(findHIndex(citation));
    }
}
