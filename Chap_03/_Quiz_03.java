package Chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        String j1 = "901231-1234567";
        System.out.println(j1.substring(0,8));
        System.out.println(j1.substring(0,j1.indexOf("-")+2));
        System.out.println(j1.substring(j1.indexOf("9"),j1.indexOf("234567")));
        String j2 = "030708-4567890";
        System.out.println(j2.substring(0,8));
        System.out.println(j2.substring(0,j2.indexOf("-")+2));
        System.out.println(j2.substring(j2.indexOf("0"),j2.indexOf("567890")));
    }
}
