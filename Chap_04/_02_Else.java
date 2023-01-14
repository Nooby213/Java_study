package Chap_04;

public class _02_Else {
    public static void main(String[] args) {
        // 조건문 If Else
        int hour = 10;
        if(hour <14){
            System.out.println("아아 +1");
        }
        else {
            System.out.println("아아(디카페인) +1");
        }
        System.out.println("커준완 #1");

        hour = 14;
        boolean mc = false;
        if(hour >= 14 || mc){
            System.out.println("아아(디카페인)");
        } else {
            System.out.println("아아");
        }
        System.out.println("커준완 #2");
    }
}
