package Recursion;

public class powerset {
    public static void powerSet(int i, String str, String result){
        if (i == str.length()){
            System.out.print(result + " ");
            return;
        }
        powerSet(i+1,str,result+str.charAt(i));
        powerSet(i+1,str,result);
    }
    public static void main(String[] args) {
        powerSet(0,"abc","");
    }
}
