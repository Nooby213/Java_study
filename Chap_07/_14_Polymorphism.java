package Chap_07;

import Chap_07.Camera.Camera;
import Chap_07.Camera.FactoryCam;
import Chap_07.Camera.SpeedCam;

public class _14_Polymorphism {
    public static void main(String[] args) {
        // 다형성
        // class Person
        // class Student extends Person
        // class Teacher extends Person

        Camera camera = new Camera();
        Camera /*FactoryCam*/ factoryCam = new FactoryCam();
        Camera /*SpeedCam*/ speedCam = new SpeedCam();

        camera.showMainFeature();
        factoryCam.showMainFeature();
        speedCam.showMainFeature();

        Camera[] cameras = new Camera[3];   // 부모 클래스에 있는 메소드만 사용가능
        cameras[0] = new Camera();
        cameras[1] = new FactoryCam();
        cameras[2] = new SpeedCam();

        for (Camera cam : cameras) {
            cam.showMainFeature();
        }

        System.out.println("-----------");
        // ((원하는 클래스 이름/폼)xxxx).xxx

        if (camera instanceof Camera) {
            System.out.println("This is a camera");
        }

        if (factoryCam instanceof FactoryCam) {
            ((FactoryCam)factoryCam).detectFire();
        }

        if (speedCam instanceof SpeedCam) {
            ((SpeedCam) speedCam).checkSpeed();
        }

        Object[] objects = new Object[3]; // 제일 큰 클래스 Object, 거의 모든 객체 포함가능
        objects[0] = new Camera();
        objects[1] = new FactoryCam();
        objects[2] = new SpeedCam();
    }
}
