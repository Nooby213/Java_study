package Chap_02;

public class _05_Operator5 {
    public static void main(String[] args) {
        //상황 연산자
        //결과 = (조건) ? (참의 경우 결과값) : (거짓의 경우 결과값)
        int a = 1;
        int b = 7;
        int max = (a > b) ? a : b;
        System.out.println(max);

        int min = (a < b) ? a : b;
        System.out.println(min);

        boolean c = (a == b) ? true : false;
        System.out.println(c);

        String d = (a != b) ? "O" : "X";
        System.out.println(d);
    }
}
