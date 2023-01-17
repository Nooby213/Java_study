package Chap_04;

public class _11_Continue {
    public static void main(String[] args) {
        // Continue
        // 음식 주문 손님 중에 노쇼 손님 존재
        //for
        int max = 20;
        int sold_out = 0;
        int no_show = 17;
        for (int i = 1; i <= 50; i++) {
            System.out.println(i + " 번 손님 음식나왔습니다.");
            
            //음식 가져가져 가야 소모됌 = 손님 없다면 noshow
            if (i == no_show){
                System.out.println(i + "번 손님 노쇼로 취소됩니다");
                continue; // 이하에 있는 코드 실행x 다음 증감으로 넘어감
            }
            sold_out++;
            if (sold_out == max){
                System.out.println("재료 소진");
                break;
            }
        }
        System.out.println("영업 종료");

        // While 문 Continue
        sold_out = 0;
        int index = 0;
        no_show = 13;
//        while(index <= 50){
        while (true){
            index++; // #1+ #2 , index = 0;
            System.out.println(index + "번 손님 음식가져가세요");
            if (index == no_show){
                System.out.println(index + " 번 손님 안 계시면 다음 손님");
//                index++; //#1 , index = 1;
                continue;
            }
            sold_out++;
            if (sold_out == max){
                System.out.println("재료소진");
                break;
            }
//            index++; //#2 , index = 1;
        }
        System.out.println("영업 종료입당");
    }
}
