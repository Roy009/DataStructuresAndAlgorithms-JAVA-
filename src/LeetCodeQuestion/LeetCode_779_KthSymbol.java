package LeetCodeQuestion;

public class LeetCode_779_KthSymbol {
    static int KthSymbolInGrammer(int n,int k){
        int l = 0, h = (int) Math.pow(2,n-1);
        return helperKthSymbol(l,h,k,0);
    }
    static int helperKthSymbol(int l, int h, int k, int curr){
        if (l == h) return 0;
        int m = (l+h)/2;
        if (k > m) helperKthSymbol(m+1,h,k,1-curr);
        return helperKthSymbol(l,m,k,curr);
    }
    public static void main(String[] args) {
        System.out.println(KthSymbolInGrammer(2,2));
    }
}
