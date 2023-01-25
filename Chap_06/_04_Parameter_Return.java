package Chap_06;

public class _04_Parameter_Return {
    public static int getPower(int number){
        int result = number * number;
        return result;
    }
//        public static void powerByExp(int n, int exponent){
//            int r = 1;
//            for (int i = 0; i < exponent; i++) {
//                r *= n;
//            }
//            System.out.println(n + " 의 " + exponent + " 승은 " + r);
//        }
    public static int getPowerByExp(int n, int exp){
        int r = 1;
        for (int i = 0; i < exp; i++) {
            r *= n;
            }
        return r;
    }
    public static void main(String[] args) {
//전달값과 반환값이 있는 메소드
        int retVal = getPower(2); // 2 * 2 = 4
        System.out.println(retVal);

        retVal = getPower(3);
        System.out.println(retVal);

        retVal = getPowerByExp(3,3);
        System.out.println(retVal);

        System.out.println(getPowerByExp(7,2));
    }
}
