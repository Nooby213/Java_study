package Chap_07.Camera;

public /*final*/ class ActionCam extends Camera {
//    public final String lens = "Wide Lens";
    public final String lens;// "Wide Lens"; //선언과 동시에 초기화
    public ActionCam() {
        super("Action Cam");
        lens = "Wide lens"; // 생성자 내에서 , 객체가 만들어 지는 동시에 선언되는거
    }

    public final void makeVideo() {
        System.out.println(this.name + " : Making a Video with " + this.lens);
    }
}
