package Logic_Building;

public class Pattern3 {
    public static void main(String[] args) {

//        1
//        1 2
//        1 2 3
//        1 2 3 4

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
