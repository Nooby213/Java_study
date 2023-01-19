package Chap_06;

public class _03_Return {
    //호텔 전화번호
    public static String getTel(){
        String tel = "01-234-5678";
        return  tel;
    }
    //호텔 주소
    public static String getAdd(){
        return "부산시 우리동네";
    }
    //호텔 엑티비티
    public static String getAct(){
        return "볼링, 탁구, 노래";
    }

    public static void main(String[] args) {
        //반환값, Return
        String conTtel = getTel();
        System.out.println(conTtel);
        String address = getAdd();
        System.out.println(address);
        System.out.println(getAct());
    }
}
