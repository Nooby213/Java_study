package Chap_05;

public class _04_MultiArrayLoop_2 {
    public static void main(String[] args) {
        // 10 x 15의 영화관
        String[][] seats = new String[10][15];
        String[] alpha = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
        for (int i = 0; i < seats.length; i++) { //세로
            for (int j = 0; j < seats[i].length; j++) {
                seats[i][j] = alpha[i] + (j + 1);
            }
        }

        // 표 구매
        seats[7][8] = "__";
        seats[7][9] = " ___ ";

        for (int i = 0; i < seats.length; i++) { //세로
            for (int j = 0; j < seats[i].length; j++) {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }


    }
}