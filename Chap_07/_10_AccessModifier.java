package Chap_07;

public class _10_AccessModifier {
    public static void main(String[] args) {
        // 캡슐화 Encapsulation
        // 정보은닉 Information hiding

        // 접근 제어자
        // private : 해당 클래스 내에서만 접근 가능
        // public : 모든 클래스에서 접근 가능
        // default : (아무것도 적지 않았을 때) 같은 패키지 내에서만 접근 가능
        // protected : 같은 패키지 내에서, 다른 패키지인 경우 자식 클래스에서 접근 가능
        // Method 에도 접근 제어자 사용가능
        // Class 에도 사용 가능
        // public class 일 경우 파일명과 이름이 같아야됨

        BlackboxRefurbish b1 = new BlackboxRefurbish();
        b1.modleName = "Blacky";
        b1.resolution = "FHD";
        b1.setPrice(200000);
//        b1.price = 200000;    BlackboxRefurbish private로 접근 불가
        b1.color = "Black";

        // 할인 행사
        b1.setPrice(-5000);
        System.out.println("진짜 가격은 : " + b1.getPrice());
//        b1.price = -5000;
//        System.out.println(b1.price);

        // 고객 문의
        System.out.println(b1.resolution);

        BlackboxRefurbish b2 = new BlackboxRefurbish();
        b2.setModleName("whitey");
        b2.setPrice(100000);
        b2.setColor("White");

        System.out.println("가격 : " + b2.getPrice());
        System.out.println("해상도 : " + b2.getResolution());
//        b2.price = -5000;
//        System.out.println(b2.price);
    }
}
class A {

}
