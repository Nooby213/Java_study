package Chap_04;

public class _04_SwitchCase {
    public static void main(String[] args) {
        // Switch Case
        int r = 1;
        if(r == 1){
            System.out.println("금메달");
        } else if (r == 2) {
            System.out.println("은메달");
        } else if (r == 3){
            System.out.println("동메달");
        } else {
            System.out.println("메달 없음");
        }
        System.out.println("조회 완료 #1");

        //Switch Case 문을 이용
//        switch ( 표현 ){
//            case A: 수행할 명령
//                break;
//            case B: 수행할 명령
//                break;
//            case C: 수행할 명령
//                break;
//            default : 수행할 명령
        r = 4;
        switch (r){
            case 1:
                System.out.println("금메달");
                break;
            case 2:
            case 4:    //2와 4 통합
                System.out.println("은메달");
                break;
            case 3:
                System.out.println("동메달");
                break;
            default:
                System.out.println("메달 없음");
        }
        System.out.println("조회 완료 #2");

        //등급별 가격책정 (순차적 가산)   break 없으면 한 번에 연산
        int g = 4;
        int p = 7000;
        switch (g){
            case 1:
                p += 1000;
            case 2:
                p += 500;
            case 3:
                p += 200;
                break;
        }
        System.out.println(g + "등급의 가격은 " + p + "원");

        //범위나 여러개의 값은 If Else , 정확한 값은 Switch case
    }
}
