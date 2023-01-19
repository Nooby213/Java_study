package Chap_06;

public class _02_Parameter {
    public static void power(int a){ // Parameter, 매개변수
        int result = a * a;
        System.out.println(a + " 의 2승은 " + result);
    }
    public static void powerByExp(int n, int exponent){
        int r = 1;
        for (int i = 0; i < exponent; i++) {
            r *= n;
        }
        System.out.println(n + " 의 " + exponent + " 승은 " + r);
    }
    public static void main(String[] args) {
        // 전달값, Parameter
        // 2 > 2 x 2 = 4
        // 3 > 3 x 3 = 9

        //Argument, 인수
        power(3);
        power(29);
        power(239102);
        powerByExp(2,8);
    }
}
