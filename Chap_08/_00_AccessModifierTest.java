package Chap_08;

import Chap_07.BlackBox;
import Chap_07.BlackboxRefurbish;
//import Chap_07.*; // Chap_07 패키지의 모든 정보를 가져씀

public class _00_AccessModifierTest {
    public static void main(String[] args) {
        BlackboxRefurbish b1 = new BlackboxRefurbish();
        b1.modleName = "BB"; // public
        // b1.resolution = "FHD"; // default 라 사용 불가
        //b1.Price; // private 이라 사용 불가
//        b1.color= "Black";// protected
//        A a = new A();

        BlackBox b2;
    }
}
