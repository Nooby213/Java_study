package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name = "하이";
//        name = "하이";
        int  hour = 15;
        System.out.println(name + "님," + hour + "시 방문예정");
        System.out.println(name + "님,방문완료");
        
        double score = 19.2;
        char grade = 'Z';
        name = "바이";
        System.out.println(name + "님의 점수" + score + "점입니다");
        System.out.println("학점은 " +grade + "입니다ㅋㅋ");

        boolean pass = false;
        System.out.println("이번 시험에서 당신은 " + pass + " 입니다ㅋㅋㅋ");

        double d = 92.123456789;
        float f = 92.123456789f;
        System.out.println(d);
        System.out.println(f);

        long l = 1000000000000l;
        l = 1_000_000_000_000l;
        System.out.println(l);
    }
}
