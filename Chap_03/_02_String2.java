package Chap_03;

public class _02_String2 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";

        //문자열 변환
        System.out.println(s.replace(" and", ","));//and>>,
        System.out.println(s.substring(7));//index 기준 7부터 시작
        System.out.println(s.substring(s.indexOf("Java")));
        System.out.println(s.substring(s.indexOf("Java"),s.indexOf(".")));//시작부터 끝위치 전까지
        System.out.println(s.substring(s.indexOf("Java"),s.lastIndexOf("and")));//시작부터 끝위치 전까지

        //공백 제거
        s = "            I learn Java.          ";
        System.out.println(s);
        System.out.println(s.trim()); // 앞 뒤 공백 제거

        // 문자열 결합
        String s1 = "Java";
        String s2 = "C#";
        System.out.println(s1 + s2);
        System.out.println(s1.concat(", ").concat(s2));
    }
}
