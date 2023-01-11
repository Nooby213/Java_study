package chap_01;

public class _07_Typecasting {
    public static void main(String[] args) {
        // 형변환 TypeCasting
        // 정수형에서 실수형으로 / 실수형에서 정수형으로

        //int to float, double
        int score = 12;
        System.out.println(score);
        System.out.println((float) score);
        System.out.println((double) score);

        //float, double to int
        float score_f = 33.3f;
        double score_d = 92.6;
        System.out.println((int) score_f);
        System.out.println((int) score_d);

        // 정수 + 실수 연산
        score = (int) 12.8 + (int) 44.2;
        System.out.println(score);

        score_d = 23.3 + 11.7; //실수형은 굳이 (double) 필요없다
        System.out.println(score_d);

        //변수에 형변환된 데이터 집어넣기
        double converted_score_double = score;
        System.out.println(converted_score_double);
        // int > long > float > double (자동 형변환)

        int converted_score_int = (int) score_d;
        System.out.println(converted_score_int);
        // double > float > long > int (수동 형변황)

        // 숫자를 문자열로
        String s1 = String.valueOf(23);
        s1 = Integer.toString(23);
        System.out.println(s1);

        String s2 = String.valueOf(93.2);
        s2 = Double.toString(94.2);
        System.out.println(s2);

        //문자열을 숫자로
        int i = Integer.parseInt("102");
        System.out.println(i);
        double d =  Double.parseDouble("291.2");
        System.out.println(d);

//        int error = Integer.parseInt("kong");
    }
}
