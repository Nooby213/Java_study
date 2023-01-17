package Chap_04;

public class _10_Break {
    public static void main(String[] args) {
        // Break
        //매일 20개씩 판매 (1인당 1개만 구매가능)
        //손님 50명 대기
        int max = 20;
        for (int i = 1; i <= 50; i++) {
            System.out.println(i + "번 손님, 주문하신 음식 나왔습니다");
            if (i == max) {
                System.out.println("금일 재료 소진");
                break; // 반복문 탈출
            }
        }
        System.out.println("영업 종료");
        
        // While 문 탈출
        int index = 1;//대기번호
        while (index <=50) {
            System.out.println(index + "번 손님 음식 나왔어요");

            if (index == max) {
                System.out.println("재료 소진");
                break;
            }
            index++;
        }
        System.out.println("영업 끝!!");
    }
}
