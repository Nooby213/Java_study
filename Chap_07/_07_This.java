package Chap_07;

public class _07_This {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modleName = "BB"; // BB(The latest)
        b1.appendModelName("(The latest)");
        System.out.println(b1.modleName);
    }
}
