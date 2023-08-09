package GeeksForGeeksSolutions;

import java.util.Arrays;

public class IsAnagram {
    public static boolean isAnagram(String a, String b){
        if (a.length() != b.length()) return false;
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        for (int i = 0; i < a.length(); i++) {
            arr1[a.charAt(i) - 'a']++;
            arr2[b.charAt(i) - 'a']++;
        }
        if(Arrays.equals(arr1,arr2)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String a = "abcd";
        String b = "dcba";
        System.out.println(isAnagram(a,b));
    }
}
