package Chap_06;

public class _07_VariableScope {
    public static void methodA(){
//        System.out.println(number);
    }
    public static void methodB(){
//        int result = 1;  // 지역 변수
    }
    public static void main(String[] args) {
        int number = 3;  // 메소드에 쓸 때엔 전달값으로 사용 가능
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
//        System.out.println(i);
    }
}
