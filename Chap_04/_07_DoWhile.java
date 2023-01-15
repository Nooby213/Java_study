package Chap_04;

public class _07_DoWhile {
    public static void main(String[] args) {
        // 반복문 Dowhile
        int d = 25; //전체량
        int m = 0; //이동량
        int h = 2; //물체 길이 2
        while(m + h <= d) {
            System.out.println("이동을 계속 합니다");
            System.out.println("현재 이동 거리는 " + m);
            m += 3;
        }
        System.out.println("이동 완료 #1");

        //물체 길이가 길 때
        m = 0;
        h = 25;
        while(m + h < d) {
            System.out.println("이동을 계속 합니다");
            System.out.println("현재 이동 거리는 " + m);
            m += 3;
        }
        System.out.println("이동 완료 #2");

        //Do While 반복문
//        do{
//
//        }while (조건)
        do {
            System.out.println("이동을 계속 합니다");
            System.out.println("현재 이동 거리는 " + m);
            m += 3;
        } while(m + h < d);
        System.out.println("이동 완료 #3");
    }
}
