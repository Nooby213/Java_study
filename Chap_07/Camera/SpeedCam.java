package Chap_07.Camera;

public class SpeedCam extends Camera { // 자식 클래스


    public SpeedCam() {
        this.name = "Speed Cam";
    }

    public void checkSpeed() {
        // 속도 체크
        System.out.println("Measuring speed");
    }

    public void recognizeLicensePlate() {
        // 번호 인식
        System.out.println("Recognize the number");
    }

    @Override // annotation (compiler) 소스코드를 컴퓨터가 알 수 있는 소스 코드로 변환
    public void showMainFeature() {
        System.out.println(this.name + " 의 주요 기능 : 속도 측정, 번호 인식");
    }
}

