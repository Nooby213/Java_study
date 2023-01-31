package Chap_07;

import java.util.HashMap;

public class _Answer_07 {
    public static void main(String[] args) {

        Hamburger[] hamburgers = new Hamburger[3];
        hamburgers[0] = new Hamburger();
        hamburgers[1] = new Cheeseburger();
        hamburgers[2] = new Shrimpburger();

        System.out.println("주문하신 메뉴를 만듭니다.");
        System.out.println("--------------");
        for (Hamburger hamburger : hamburgers) {
            hamburger.cook();
            System.out.println("--------------");
        }
        System.out.println("메뉴 준비가 완료되었습니다.");
    }
}

class Hamburger {
    public String name;

    public Hamburger() {
        this("Hamburger");
    }

    public Hamburger(String name) {
        this.name = name;
    }

    public void cook() {
        System.out.println(this.name + "를 만듭니다.");
        System.out.println("빵 사이에 들어가는 재료는?");
        System.out.println("> 양상추");
        System.out.println("+ 패티");
        System.out.println("+ 피클");
    }

}

class Cheeseburger extends Hamburger {
    public Cheeseburger() {
        super("Cheeseburger");
    }
    public void cook() {
//        System.out.println("빵 사이에 들어가는 재료는?");
//        System.out.println("> 양상추");
//        System.out.println("+ 패티");
//        System.out.println("+ 피클");
        super.cook();
        System.out.println("+ 치즈");
    }

}

class Shrimpburger extends Hamburger {
    public Shrimpburger() {
        super("Shrimpburger");
    }
    public void cook() {
        super.cook();
        System.out.println("+ 새우");
    }

}