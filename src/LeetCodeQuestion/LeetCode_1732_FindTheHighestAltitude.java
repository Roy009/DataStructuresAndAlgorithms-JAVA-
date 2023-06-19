package LeetCodeQuestion;

public class LeetCode_1732_FindTheHighestAltitude {
    public static int highestAltitude(int[] gains){
        int currentAltitude = 0;
        int highestAltitude = currentAltitude;
        for (int altitude: gains) {
            currentAltitude += altitude;
            highestAltitude = Math.max(highestAltitude, currentAltitude);
        }
        return highestAltitude;
    }
    public static void main(String[] args) {
        int[] gains = {-5,1,5,0,-7};
        System.out.println(highestAltitude(gains));
    }
}
