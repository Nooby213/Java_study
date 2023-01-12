package Chap_02;

public class _01_Operator1 {
    public static void main(String[] args) {
        //산술 연산자

        //일반 연산
        System.out.println(4 + 2);
        System.out.println(4 - 2);
        System.out.println(4 * 2);
        System.out.println(4 / 2);
        System.out.println(5 / 2);
        System.out.println(2 / 4);
        System.out.println(4 % 2); // 4 / 2 나머지
        System.out.println(5 % 2);

        //우선 순위 연산
        System.out.println(2 + 2 * 2);
        System.out.println((2 + 2) * 2);

        //변수를 이용한 연산
        int a = 20;
        int b = 10;
        int c;
        c = a + b;
        System.out.println(c);

        c = a - b;
        System.out.println(c);

        c = a * b;
        System.out.println(c);

        c = a / b;
        System.out.println(c);

        c = a % b;
        System.out.println(c);

        // 증감 연산 ++, --
        int val;
        val = 10;
        System.out.println(val);
        System.out.println(++val);//11
        System.out.println(val);//11

        val = 10;
        System.out.println(val);
        System.out.println(val++);//10
        System.out.println(val);//11
//        val++;//문장 연산 우선 > sout > +1 : 그 다음 문장에서 적용
//        ++val;//val+i 우선 : 10+1 > sout

        val = 10;
        System.out.println(val);
        System.out.println(--val);//9
        System.out.println(val);//9

        val = 10;
        System.out.println(val);
        System.out.println(val--);//10
        System.out.println(val);//9

        // 예시) 은행 대기표
        int waiting = 0;
        System.out.println("대기 인원 : " + waiting++);
        System.out.println("대기 인원 : " + waiting++);
        System.out.println("대기 인원 : " + waiting++);
        System.out.println("총 대기 인원 : " +waiting);

    }
}
