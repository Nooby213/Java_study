package Chap_08.Camera;

public abstract class Camera {  //객체로 만들 수 없게 하는 용도로 할 수 있다.
    public void takePicture() {
        System.out.println("Taking a picture");
    }

    public void recordVideo() {
        System.out.println("Recording a video");
    }

    public abstract void showMainFeature(); // 구현해야 하는 메소드
}
