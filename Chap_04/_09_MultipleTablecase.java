package Chap_04;

public class _09_MultipleTablecase {
    public static void main(String[] args) {
        //구구단   내가 만든 구구단
        for (int i = 2; i < 10; i++) {
            System.out.println("  " + i + " 단 ");
            for (int j = 1; j < 10; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
//                System.out.println(i*j);
            }
            System.out.println();
        }
    }
}
