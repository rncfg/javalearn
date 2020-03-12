package JavaLearn1;

public class Mnarr {
    public static void main(String[] args) {
        int[][] arr = new int[][]{    //объявление двумерного массива
                {23, 78, 65, 79},
                {11, 22, 11, 45},
                {33, 44, 66, 54}
        };
        arr[1][1] = 234;

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 4; j++) {

                    System.out.print(arr[i][j] + " ");
                }
                System.out.println("");
            }
    }
}