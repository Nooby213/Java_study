package Chap_09;

public class _03_WrapperClass {
    public static void main(String[] args) {

        // Wrapper 클래스
        // int double float char
//    int = Integer float = Float char = Character double = Double

        Integer i = 123;
        Double d = 1.23;
        Character c = 'A';

        System.out.println(i);
        System.out.println(d);
        System.out.println(c);

        System.out.println("--------");

        System.out.println(i.intValue());
        System.out.println(d.intValue());
        System.out.println(c.charValue());
        String s = i.toString();
        System.out.println(s);
    }
}
