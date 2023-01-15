package Chap_04;

public class _06_While {
    public static void main(String[] args) {
        // 반복문 While
        int d = 25;// 총 량
        int m = 0;// 이동량
//        while (조건){
//        }
        while(m <= d) {
            System.out.println("이동을 계속 합니다");
            System.out.println("이동 거리는 : " + m);
            m += 3;// 3씩 이동
        }
        System.out.println("이동완료 #1");

        //무한 루프
        d = 25;// 총 량
        m = 0;// 이동량
        int i = 0;
//        while (조건){
//        }
        while(m <= d) {
            System.out.println("이동을 계속 합니다");
            System.out.println("이동 거리는 : " + m +i++);
        }
    }
}
