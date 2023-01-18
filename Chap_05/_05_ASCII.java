package Chap_05;

public class _05_ASCII {
    public static void main(String[] args) {


        // 아스키 코드 (ANSI) : 미국 표준 코드
        char a = '0';
        System.out.println(a);
        System.out.println((int)a);

        char b = '1';
        System.out.println(b);
        System.out.println((int)b);

        b++;
        System.out.println(b);
        System.out.println((int)b);
        //알파벳 대문자는 65부터 시작, 소문자는 97부터, 숫자(0)는 48부터 시작

        // 10 x 15의 영화관
        String[][] seats = new String[10][15];
        char q = 'A';
        for (int i = 0; i < seats.length; i++) { //세로
            for (int j = 0; j < seats[i].length; j++) {
                System.out.print(seats[i][j] = String.valueOf(q) + (j + 1) + " ");
            }
            q++;
            System.out.println();
        }
    }
}
