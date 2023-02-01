package Chap_08;

import Chap_08.Camera.Camera;
import Chap_08.Camera.FactoryCam;
import Chap_08.Camera.SpeedCam;

public class _01_AbstractClass {
    public static void main(String[] args) {
        // 데이터 추상화 (Data Abstraction)
        // abstract
        // 추상 클래스 ( 아직 완성되지 않은 클래스) - 객체로 만들 수 없다. 자식 클래스로는 가능 ( 추상 메소드 구현해야함)
        // 추상 메소드 ( 추상 클래스 또는 인터페이스에서 사용 가능한, 껍데기만 있는 메소드)

//        Camera camera = new Camera(); X
        Camera /*FactoryCam*/ factoryCam = new FactoryCam();
        factoryCam.showMainFeature();

        Camera speedCam = new SpeedCam();
        speedCam.showMainFeature();
    }
}
