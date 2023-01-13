package Chap_03;

public class _04_EscapeSequence {
    public static void main(String[] args) {
        //특수문자, 이스케이프 문자 (Escape Sequence, Escape Character, Special Character)
        // \n \t \\ \" \'
//        System.out.println("자바");
//        System.out.println("너무");
//        System.out.println("어렵당");
        System.out.println("자바\n너무\n어렵당"); //   \n 줄바꿈

        //돌고래 100원
        //고구마 200원
        //바나나 3000원
        System.out.println("돌고\t100원");
        System.out.println("고구마\t200원");
        System.out.println("바나나\t3000원"); //   \t   탭

        System.out.println("C:\\Program Files\\Java");//     \\ : \

        System.out.println("나는 \"강아지가 좋다\"고 했어요");//  \"  : "
        System.out.println("나는 \'강아지가 좋다\'고 생각했어요");// \' : '
        System.out.println("나는 '강아지가 좋다'고 생각했어요");

        char a = 'A';
        System.out.println(a);
        a = '\'';
        System.out.println(a);
        
    }
}
