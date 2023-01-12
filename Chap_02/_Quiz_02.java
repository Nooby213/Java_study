package Chap_02;

public class _Quiz_02 {
    public static void main(String[] args) {
        double a = 120;
        double b;
        b = 127.1;
        String c = (a <= b) ? "O" : "X";
        System.out.println(c);


        //답은
        int height = 115;
        String result = (height >=120) ? "탑승 가능합니다." : "탑승 불가능합니다.";
        System.out.println("키가" + height + "cm 이므로 " + result);
    }
}
