package Chap_07;

public class _03_ClassVariables {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1. modleName = "Blacky";
        System.out.println(b1.modleName);

        BlackBox b2 = new BlackBox();
        b2.modleName = "Whitey";
        System.out.println(b2.modleName);

        // 특정 범위를 초과하는 충돌 감지 시 자동 신고 기능 개발 여부
        System.out.println("  개발 전  ");
        System.out.println(b1.modleName + " 자동 신고 기능 : " + b1.autoReport);
        System.out.println(b2.modleName + " 자동 신고 기능 : " + b2.autoReport);
        System.out.println("모든 블랙박스 제품 자동 신곤 기능 : " + BlackBox.autoReport);
       
        // 기능 개발
        BlackBox.autoReport = true;
        System.out.println("  개발 후  ");
        System.out.println(b1.modleName + " 자동 신고 기능 : " + b1.autoReport);
        System.out.println(b2.modleName + " 자동 신고 기능 : " + b2.autoReport);
        System.out.println("모든 블랙박스 제품 자동 신곤 기능 : " + BlackBox.autoReport);
    }
}
