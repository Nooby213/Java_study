package Chap_07;

import Chap_07.Camera.Camera;

public class _16_Reference {
    public static void main(String[] args) {
        // 참조
        // 기본 자료형 ( Primitive Data Types) : int, float, double, long, boolean, ...
        // 기본 자료형은 기본값 0
        // 사용할 수 있는 메소드 x
        int[] i = new int[3];
        System.out.println(i[0]);

        double[] d = new double[3];
        System.out.println(d[0]);

        // 참조 자료형 (Non-Primitive, Reference Data Types) : String, Camera, FactoryCam, ...
        // 기본값 null
        // 메소드 가질 수 있다.
        String[] s = new String[3];
        System.out.println(s[0]);

        Camera[] c = new Camera[3];
        System.out.println(c[0] == null);
        System.out.println("-------------");

        int a = 10;  // 기본 자료형 일 때는 복사
        int b = 20;
        b = a;
        System.out.println(a);
        System.out.println(b);
        b = 30;
        System.out.println(a);
        System.out.println(b);
        System.out.println("-------------");

        Camera c1 = new Camera(); // 참조형 일 때는 가리키는 대상이 달라짐
        Camera c2 = new Camera();
        c1.name = "C1";  // c1 >> c1
        c2.name = "C2";  // c2 >> c2
        System.out.println(c1.name);
        System.out.println(c2.name);
        c2 = c1;  // c2 >> c1   c1이 참조하는 내용을 c2도 참조
        System.out.println(c1.name);
        System.out.println(c2.name);
        c2.name = "Broken C2";
        System.out.println(c1.name);
        System.out.println(c2.name);
        changeName(c2);
        System.out.println(c1.name);
        System.out.println(c2.name);

        c2 = null;  // c2 참조 하는 내용이 없다
//        System.out.println(c2.name);
        System.out.println(c1.name);
    }
    public static void changeName(Camera camera) {
        camera.name = "Wrong Cam";
    }
}
