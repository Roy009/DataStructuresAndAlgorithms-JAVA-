package Logic_Building;

public class Pattern4 {
    public static void main(String[] args) {
//        1
//        2 2
//        3 3 3
//        4 4 4 4
//        5 5 5 5 5

        for (int i = 0; i <= 5 ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
