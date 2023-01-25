package Chap_07;

public class _04_Method {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modleName = "BB";
        b1.canAutoReport();
        BlackBox.autoReport = true;
        b1.canAutoReport();
        b1.insertMemoryCard(256);

        // 일반 영상 : 1
        // 이벤트 영상 (충돌 감지) : 2
        int fileCount = b1.getVideoFileCount(1); //일반
        System.out.println("일반 영상 파일 수 : " + fileCount + "개");

        fileCount = b1.getVideoFileCount(2); //이벤트
        System.out.println("일반 영상 파일 수 : " + fileCount + "개");

        fileCount = b1.getVideoFileCount(11);
        System.out.println("일반 영상 파일 수 : " + fileCount + "개");
    }
}
