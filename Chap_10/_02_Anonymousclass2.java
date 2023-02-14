package Chap_10;

public class _02_Anonymousclass2 {
    public static void main(String[] args) {
        HomeMadeBurger momMadeBurger = getMomMadeBurger();
        momMadeBurger.cook();
        
        HomeMadeBurger brotherMadeBurger = getBrotherMadeBurger();
        brotherMadeBurger.cook();
    }

    private static HomeMadeBurger getBrotherMadeBurger() {
        return new HomeMadeBurger() {
            @Override
            public void cook() {
                System.out.println("군데리아 : 빵, 소스, 냉동패티");
            }
        };
    }

    public static HomeMadeBurger getMomMadeBurger(){
        return new HomeMadeBurger() {
            @Override
            public void cook() {
                System.out.println("엄마 수제 버거");
                System.out.println("재료 : 빵, 패티, 치즈, 양상추, 마요네즈");
            }
        };
    }
}
abstract class HomeMadeBurger {
    public abstract void cook();
}