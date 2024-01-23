package Competitive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FastIO {
    static class FastInputOutput{
        BufferedReader br;
        StringTokenizer st;
        public FastInputOutput(){
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        String next(){
            while(st == null || !st.hasMoreElements()){
                try{
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt(){ return Integer.parseInt(next());}
        long nextLong(){ return Long.parseLong(next());}
        double nextDouble(){
            return Double.parseDouble(next());
        }
        String nextLine(){
            String str = "";
            try{
                if(st.hasMoreTokens()){
                    str = st.nextToken("\n");
                }else {
                    str = br.readLine();
                }
            } catch(IOException e){
                e.printStackTrace();
            }
            return str;
        }
    }
    public static void main(String[] args) {
        FastInputOutput s = new FastInputOutput();
        int n = s.nextInt();
        int k = s.nextInt();
        int count = 0;
        while(n-- > 0){
            int x = s.nextInt();
            if(x % k == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
