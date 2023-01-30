package Chap_07.Camera;

public class FactoryCam extends Camera { // 자식 클래스

    public FactoryCam() {
        this.name = "Factory Cam";
    }
    public void detectFire() {
        // 화재 감지
        System.out.println("Detecting fire");
    }
    public void showMainFeature() {
        System.out.println(this.name + " 의 주요 기능 : 화재 감지");
    }
}
