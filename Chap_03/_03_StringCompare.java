package Chap_03;

public class _03_StringCompare {
    public static void main(String[] args) {
        //문자열 비교
        String s1 = "Java";
        String s2 = "Python";
        System.out.println(s1.equals(s2));// 문자열 같으면 true !=false
        System.out.println(s1.equals("Java"));// 문자열 같으면 true !=false
        System.out.println(s2.equals("python"));

        //대소문자 구분없이
        System.out.println(s2.equalsIgnoreCase("python"));

        //문자열 비교 심화
        s1 = "1234"; //문자열 참조 (똑같은 내용을 배껴씀)
        s2 = "1234";
        System.out.println(s1.equals(s2)); //(내용을 비교)
        System.out.println(s1 == s2); //(참조하는 곳을 비교)

        s1 = new String("1234"); //각각 다른 곳에 데이터가 존재
        s2 = new String("1234");
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);

    }
}
