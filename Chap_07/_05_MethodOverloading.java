package Chap_07;

public class _05_MethodOverloading {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modleName = "BB";

        b1.record(false, false, 10);
        System.out.println("---------");
        b1.record(true, false, 3);
        System.out.println("---------");
        b1.record(true, true, 3);
        b1.record();
    }
}
