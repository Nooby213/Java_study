package Chap_07.Camera;

public class Camera { // 부모 클래스, 하나의 부모만 상속가능
    public String name;

    public Camera() {
        this.name = "Camera";
    }

    public void takePicture() {
        // 사진 촬영
        System.out.println(this.name + " : Take a picture");
    }

    public void recordVideo() {
        // 동영상 촬영
        System.out.println(this.name + " : Recording a video");
    }

    public void showMainFeature() {
        System.out.println(this.name + " 의 주요 기능 : 사진 촬영, 동영상 녹화");
    }
}
