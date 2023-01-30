package Chap_07;

import Chap_07.Camera.FactoryCam;
import Chap_07.Camera.SpeedCam;

public class _15_Super {
    public static void main(String[] args) {
        // Super 부모클래스의 어떤 것을 자식 클래스에서 접근 가능

        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        factoryCam.recordVideo();
        System.out.println();
        speedCam.takePicture();
    }
}
