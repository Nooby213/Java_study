package Chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        //주차 요금 시간당 4천원 (일일 최대 3만원)
        //경차 / 장애인 차량 50% 할인
        //일반 차량 5시간 2만원  //  경차 5시간 만원 // 장애인 10시간 1.5만원
        int t = 10;
        int f = t * 4000;
        String tp = "disabled";
        if (tp == "normal" && f <= 30000){
            System.out.println("주차시간 " + t + "시간이고 주차요금은 " + f + "원입니다.");
        } else if (tp == "normal" && f > 30000) {
            System.out.println("주차시간 " + t + "시간이고 주차요금은 " + 30000 + "원입니다.");
        } else if (tp == "small" && f * 0.5 <= 30000) {
            System.out.println("주차시간 " + t + "시간이고 주차요금은 " + (f * 0.5) + "원입니다.");
        } else if (tp == "small" && f * 0.5 > 30000) {
            System.out.println("주차시간 " + t + "시간이고 주차요금은 " + 30000 + "원입니다.");
        } else if (tp == "disabled" && f * 0.5 <= 30000) {
            System.out.println("주차시간 " + t + "시간이고 주차요금은 " + (f * 0.5) + "원입니다.");
        } else if (tp == "disabled" && t == 10) {
            System.out.println("주차시간 " + t + "시간이고 주차요금은 " + 15000 + "원입니다.");
        }

        // booleaan = 부분을 번경
        int hour = 15;
        boolean smallCar = false;
        boolean disordered = true;
        int fee = hour * 4000;
        if (fee > 30000) {
            fee = 30000;
        }
        if (smallCar || disordered) {
            fee /= 2;
        }
        System.out.println("주차 요금은 " + fee + "원 입니다");
    }
}
