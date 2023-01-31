package Chap_07;

import java.util.Random;

public class _18_Enum {
    public static void main(String[] args) {
        // 열거형 : 상수들의 묶음
        // 달력 : 1월 2월 3월 ....
        // 옷 사이즈 : S M L XL
        // OS 종류 : WINDOW  MACOS LINUX....

        Resolution resolution = Resolution.HD;
        System.out.println(resolution);
        resolution = Resolution.FHD;
        System.out.println(resolution);

        System.out.print("동영상 녹화 품질 : ");
        switch (resolution) {
            case HD :
                System.out.println("HD");
                break;
            case FHD :
                System.out.println("FHD");
                break;
            case UHD :
                System.out.println("UHD");
                break;
        }

        resolution = Resolution.valueOf("UHD");
//        System.out.println(resolution);
        System.out.print("동영상 녹화 품질 : ");
        switch (resolution) {
            case HD :
                System.out.println("HD");
                break;
            case FHD :
                System.out.println("FHD");
                break;
            case UHD :
                System.out.println("UHD");
                break;
        }

        for (Resolution myRes : Resolution.values()) {
            System.out.println(myRes.name() + " : " + myRes.ordinal());
        }

        for (Resolution myRes : Resolution.values()) {
            System.out.println(myRes.name() + " : " + myRes.getWidth());
        }
    }
}

enum Resolution {
    HD(1280), FHD(1920), UHD(3840);

    private final int width;
    Resolution(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }
}