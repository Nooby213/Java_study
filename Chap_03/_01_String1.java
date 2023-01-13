package Chap_03;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C";
        System.out.println(s);

        // 문자열의 길이
        System.out.println(s.length());

        // 대소문자 변환
        System.out.println(s.toUpperCase()); //대문자로
        System.out.println(s.toLowerCase()); //소문자로

        // 포함 관계
        System.out.println(s.contains("and")); //포함되면 true 아니면 false
        System.out.println(s.contains("Javascript"));
        System.out.println(s.indexOf("Python"));//위치정보; 0부터 시작
        System.out.println(s.indexOf("C++"));//위치정보 포함되지 않을 시; -1
        System.out.println(s.indexOf("and"));//처음위치
        System.out.println(s.lastIndexOf("and"));//마지막 위치
        System.out.println(s.startsWith("I like"));//이 문자열로 시작하면 true !=flase
        System.out.println(s.endsWith("C"));//이 문자열로 끝나면 true !=false
    }
}
