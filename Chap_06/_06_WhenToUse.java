package Chap_06;

public class _06_WhenToUse {
    public static int getPower(int number){
//        int r =  number * number;
//        return r;
        return getPowerByExp(number, 2);
    }

    public static int getPowerByExp(int i , int exponent){
        int r = 1;
        for (int j = 0; j < exponent; j++) {
            r *= i;
        }
        return r;
    }
    public static void getPowerd(int q , int ex){
        int re = 1;
        for (int i = 0; i < ex; i++) {
            re *= q;
        }
        System.out.println(re);
    }
    public static void main(String[] args) {
        // 메소드가 필요한 이유
        int r = 1;
        for (int i = 0; i < 2; i++) {
            r *= 2;
        }
        System.out.println(r);

        r = 1;
        for (int i = 0; i < 3; i++) {
            r *= 3;
        }
        System.out.println(r);

        r = 1;
        for (int i = 0; i < 2; i++) {
            r *= 4;
        }
        System.out.println(r);

        System.out.println(getPowerByExp(3,3));
        getPowerd(3,3);
        System.out.println(getPower(3));
    }
}
