package Chap_04;

public class _03_ElseIf {
    public static void main(String[] args) {
        // 조건문 Else If
        boolean a = !true;
        boolean b = !true;
        boolean c = true;
        if (a){
            System.out.println("1");
        } else if (b) {
            System.out.println("2");
        } else if (c) {
            System.out.println("3");
        }
        else {
            System.out.println("4");
        }

        // 조건문 Else If      마지막 else 없어도됌
        a = !true;
        b = !true;
        c = !true;
        if (a){
            System.out.println("1");
        } else if (b) {
            System.out.println("2");
        } else if (c) {
            System.out.println("3");
        }
        System.out.println("4");

    }
}
