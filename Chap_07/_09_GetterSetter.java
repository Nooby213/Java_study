package Chap_07;

public class _09_GetterSetter {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modleName = "Blacky";
//        b1.resolution = "FHD";
        b1.price = 200000;
        b1.color = "Black";

        // 할인 행사
        b1.price = - 5000;
        System.out.println(b1.price);

        // 고객 문의
        System.out.println(b1.resolution);

        BlackBox b2 = new BlackBox();
        b2.setModleName("whitey");
        b2.setPrice(100001);
        b2.setColor("White");

        System.out.println("가격 : " + b2.getPrice());
        System.out.println("해상도 : " + b2.getResolution());
    }
}
