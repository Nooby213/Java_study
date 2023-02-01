package Chap_08.Reporter;

public class VideoReport implements Reportable{
    @Override
    public void report() {
        System.out.println("직전 30초 영상과 함게 신고를 진행합니다.");
    }
}
