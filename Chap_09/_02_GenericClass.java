package Chap_09;

import Chap_09.Coffee.*;
import Chap_09.User.User;
import Chap_09.User.VIPUser;

public class _02_GenericClass {
    public static void main(String[] args) {
        // 제네릭 클래스
        CoffeeByNumber c1 = new CoffeeByNumber(33);
        c1.ready();
        CoffeeByNickname c2 = new CoffeeByNickname("카페인 중독");
        c2.ready();
        CoffeeByName c3 = new CoffeeByName(9);
        c3.ready();
        CoffeeByName c4 = new CoffeeByName("콩불");
        c4.ready();

        System.out.println("--------"); // object 로 받을 때 형변환 필수
        int c3Name = (int) c3.name;
        System.out.println("주문 고객 번호 : " + c3Name);
        String c4Name = (String) c4.name;
        System.out.println("주문 고객 이름 : " + c4Name);
//        c4.name = (String) c3.name;
        System.out.println("--------");

        Coffee<Integer> c5 = new Coffee<>(31);
        c5.ready();
        int c5NAme = c5.name;
        System.out.println("주문 고객 번호 : " + c5NAme);
        Coffee<String> c6 = new Coffee<>("마라탕");
        c6.ready();
        String c6Name = c6.name;
        System.out.println("주문 고객 이름 : " + c6Name);

        System.out.println("--------");
        CoffeeByUser<User> c7 = new CoffeeByUser<>(new User("낙곱새"));
        c7.ready();
        CoffeeByUser<User> c8 = new CoffeeByUser<>(new VIPUser("치킨"));
        c8.ready();

        System.out.println("--------");
        orderCoffee("찜닭","아아");
    }
    
    public static <T> void orderCoffee(T name) {
        System.out.println("커피 준비 완료 : " + name);
    }
    public static <T, V> void orderCoffee(T name, V coffee) {
        System.out.println(coffee + "준비 완료 : " + name);
    }
}