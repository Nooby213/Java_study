package Chap_04;

public class _01_IF {
    public static void main(String[] args) {
        // 조건문 If
        int h = 15;
//        if ( 조건 )
//        수행할 명령
        if (h < 14) {
            System.out.println("커피 +1");
            System.out.println("샷추가");
        }
        System.out.println("커피 나왔습니다");

        h = 10;
        boolean MC = false;
        if (h < 14 && MC ){
            System.out.println("커피 +1");
        }
        System.out.println("커피나왔습니다");

        h= 15;
        MC = true;
        if (h >= 14 || MC==false){
            System.out.println("아아 (디카페인)");
        }
        System.out.println("커준완");

    }
}
