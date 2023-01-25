package Chap_06;

public class _05_Overloading {
    public static int getPower(int number){
        int result = number * number;
        return result;
    }
    public static int getPower(String strNumber){
    int number = Integer.parseInt(strNumber);
    return number * number;
    }

    public static int getPower(int n, int exp){
        int r = 1;
        for (int i = 0; i < exp; i++) {
            r *= n;
        }
        return r;

    }

    public static void main(String[] args) {
        // 메소드 오버로딩
        // 같은 이름의 메소드를 여러 번 선언
        // 전달값의 타입이나 전달값의 수가 다를 시 메소드 오버로딩 가능
        System.out.println(getPower(3));
        System.out.println(getPower("4"));
        System.out.println(getPower(3,3));
        System.out.println(getPower("7"));
    }
}
