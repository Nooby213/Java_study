package Chap_06;

public class _Quiz_06 {
    public static String getHiddenData(String s, int dnumber) {
        if(s.length() == 3) {
            s = s.substring(0, dnumber) + "**";
        } else if (s.length() == 14) {
            s = s.substring(0, dnumber) + "******";
        }else
            s = s.substring(0, dnumber) + "****";
        return s;
    }

    public static void main(String[] args) {
        String name = "이승민";
        String id = "123456-1234567";
        String phone = "010-1234-5678";

        System.out.println("이름 : " + getHiddenData(name, 1));
        System.out.println("주민등록번호 : " + getHiddenData(id, 8));
        System.out.println("전화번호 : " + getHiddenData(phone, 9));
    }
}
