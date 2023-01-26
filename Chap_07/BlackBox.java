package Chap_07;

public class BlackBox {
    // static - 모든 객체에 공통적으로 적용 ; 변경 가능
    // 다른 것들은 객체의 값에 따라 다른 값 ; 인스턴스 변수는 변경불가
    String modleName;
    String resolution;
    int price;
    String color;
    int serialNumber;

    static int counter = 0; // 시리얼 번호 생성해주는 역할
    static boolean autoReport = false; // 자동 신고 기능
    
    BlackBox() {
//        System.out.println("기본 생성자 호출");
//        this.serialNumber = ++counter;
//        System.out.println("새로운 시리얼 넘버 : " + this.serialNumber);
    }
    BlackBox(String modleName, String resolution, int price, String color) {
//        this(); // 기본 생성자 호출
//        System.out.println("사용자 정의 생성자 호출");
//        this.modleName = modleName;
//        this.resolution = resolution;
//        this.price = price;
//        this.color = color;
    }

    void canAutoReport() {
        if (autoReport) {
            System.out.println("충돌이 감지되어 자동으로 신고합니다.");
        } else {
            System.out.println("자동 신고 기능이 지원되지 않습니다.");
        }
    }

    void insertMemoryCard(int capacity) {
        System.out.println("메모리 카드가 삽입되었습니다.");
        System.out.println("용량은 " + capacity + "기가바이트 입니다.");
    }

    int getVideoFileCount(int type) {
        if (type == 1) { //일반 영상
            return 9;
        } else if (type == 2) {
            return 1;
        }
        return 10;
    }

    void record (boolean showDateTime, boolean showSpeed, int min) {
        System.out.println("녹화를 시작합니다.");
        if (showDateTime) {
            System.out.println("영상에 날짜정보가 표시됩니다.");
        }
        if (showSpeed) {
            System.out.println("영상에 속도정보가 표시됩니다.");
        }
        System.out.println("영상은 " + min + "분 단위로 기록됩니다.");
    }
    void record() {
        record(true, true, 5);
    }

    static void callServiceCenter() {
        System.out.println("서비스 센터 (1588-0000) 로 연결합니다.");
//        autoReport = false;
    }

    void appendModelName(String modelName) {
        this.modleName += modelName;
    }

    //Getter & Setter
    String getModleName() {
        return modleName;
    }

    void setModleName(String modleName) {
        this.modleName = modleName;
    }

    String getResolution() {
        if (resolution == null || resolution.isEmpty()){
            return "판매자에게 문의하세요.";
        }
        return resolution;
    }

    void setResolution(String resolution) {
        this.resolution = resolution;
    }

    int getPrice() {
        return price;
    }
    void setPrice(int price) {
        if (price < 100000) {
            this.price = 100000;
        } else {
            this.price = price;
        }
    }

    String getColor() {
        return color;
    }

    void setColor(String color) {
        this.color = color;
    }
}
