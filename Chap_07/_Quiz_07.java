//package Chap_07;
//
//public class _Quiz_07 {
//
//    public static void main(String[] args) {
//        Hamburger hamburger = Hamburger.Cheeseburger;
//        System.out.println("주문하신 메뉴를 만듭니다.");
//        System.out.println("---------------");
//        switch (hamburger) {
//            case Hamburger:
//                System.out.println("빵 사이에 들어가는 재료는?");
//                System.out.println("> 양상추");
//                System.out.println("+ 패티");
//                System.out.println("+ 피클");
//                break;
//            case Cheeseburger:
//                System.out.println("빵 사이에 들어가는 재료는?");
//                System.out.println("> 양상추");
//                System.out.println("+ 패티");
//                System.out.println("+ 피클");
//                System.out.println("+ 치즈");
//                break;
//            case Shirimpburger:
//                System.out.println("빵 사이에 들어가는 재료는?");
//                System.out.println("> 양상추");
//                System.out.println("+ 패티");
//                System.out.println("+ 피클");
//                System.out.println("+ 새우");
//        }
//        System.out.println("---------------");
//        System.out.println("메뉴 준비가 완료되었습니다");
//
//        for (Hamburger burgs : Hamburger.values()) {
//            System.out.println(burgs.name() + " : " + burgs.getIngredient());
//        }
//    }
//}
//
//enum Hamburger {
//    Hamburger(System.lineSeparator() + "> 양상추" + System.lineSeparator() + "+ 패티" + System.lineSeparator() + "+ 피클"),
//    Cheeseburger(System.lineSeparator() + "> 양상추" + System.lineSeparator() + "+ 패티" + System.lineSeparator() + "+ 피클" + System.lineSeparator() + "+ 치즈"),
//    Shirimpburger(System.lineSeparator() + "> 양상추" + System.lineSeparator() + "+ 패티" + System.lineSeparator() + "+ 피클" + System.lineSeparator() + "+ 새우");
//    private String ingredient;
//    Hamburger(String ingredient) {
//        this.ingredient = ingredient;
//    }
//
//    public String getIngredient(){
//        return ingredient;
//    }
//}