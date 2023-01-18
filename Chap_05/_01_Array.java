package Chap_05;

public class _01_Array {
    public static void main(String[] args) {
        //배열 : 같은 자료형의 값 여러 개를 저장하는 연속된 공간
        String coffee1 = "아아";
        String coffee2 = "coco";
        String coffee3 = "pppoo";
        String coffee4 = "mose";

        System.out.println(coffee1 + "하나");
        System.out.println(coffee2 + "하나");
        System.out.println(coffee3 + "하나");
        System.out.println(coffee4 + "하나");
        System.out.println("주세요");

        //배열 선언 첫 번째 방법
//        String [] coffees = new String[4];

        //두 번째
//        String coffees [] = new String[4];
//        coffees [0] = "아아"; //0 부터 시작
//        coffees [1] = "coco";
//        coffees [2] = "pppoo";
//        coffees [3] = "mose";

        //세 번째
//        String [] coffes = new String[] {"아아", "coco", "pppoo", "mose"};
        
        //네 번째
        String [] coffes = {"아아", "coco", "pppoo", "mose"};
        
        //주문

        for (int i = 0; i < 4; i++) {
//            coffes [2] = "latte";
            System.out.println(coffes[i] + "하나");
            coffes [2] = "latte";
        }
        System.out.println("주세요");

        //다른 자료형
        int [] i = new int[3];
        i[0] = 1;
        i[1] = 2;
        i[2] = 3;
        double[] d = new double[] {11.1, 22.2, 33.3};
        boolean [] b = {true, false, false};
    }
}
