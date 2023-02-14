package Chap_10;

public class AnonymousClass1 {
    public static void main(String[] args) {
        // 익명 클래스
        Coffee c1 = new Coffee();
        c1.order("아메리카노");
        Coffee c2 = new Coffee();
        c2.order("라떼");
        
        Coffee specialCoffee = new Coffee() {
            public void order(String coffee) {
                super.order(coffee);
                System.out.println("케이크는 서비스에요.");
            }
            public void returnTray() {
                System.out.println("놔두고 가세요");
            }
        };
        specialCoffee.order("바닐라 라떼");
        specialCoffee.returnTray();
    }
}
class Coffee {
    public void order (String coffee) {
        System.out.println("주문하신 " + coffee + " 나왔습니다.");
    }
    public void returnTray() {
        System.out.println("커피 반납");
    }
}
