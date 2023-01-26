package Chap_07;

import java.sql.SQLOutput;

public class _08_Constructor {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modleName = "Blacky";
        b1.resolution = "FHD";
        b1.price = 200000;
        b1.color = "Black";
        System.out.println(b1.modleName);
        System.out.println(b1.serialNumber);

        BlackBox b2 = new BlackBox("하양", "UHD", 300000, "흰색");
        System.out.println(b2.modleName);
        System.out.println(b2.resolution);
        System.out.println(b2.price);
        System.out.println(b2.color);
        System.out.println(b2.serialNumber);
    }
}
