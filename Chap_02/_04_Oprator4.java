package Chap_02;

public class _04_Oprator4 {
    public static void main(String[] args) {
        //논리 연산자
        boolean com = true;
        boolean phon = true;
        boolean note = true;
        boolean book = false;
        System.out.println(com || book || note);//  ||=or
        System.out.println(com && phon && note);//  &&=and
        System.out.println(com && book && note);//  &&=and

        System.out.println((5 > 3) && (3 < 1));
        System.out.println((5 > 1) || (7 < 2));

        //논리 부정 연산자 : 반대로 결과
        System.out.println(!true);
        System.out.println(!false);
        System.out.println(!(5 > 3));


    }
}
