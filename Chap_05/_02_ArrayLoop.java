package Chap_05;

public class _02_ArrayLoop {
    public static void main(String[] args) {
        // 배열의 순회
        String [] coffes = new String[] {"아아", "coco", "pppoo", "mose"};

        // for 반복분 순회
        for (int i = 0; i < 4; i++) {
//            coffes [2] = "latte";
            System.out.println(coffes[i] + "하나");
            coffes [2] = "latte";
        }
        System.out.println("주세요");

        //배열의 길이를 이용한 순회   index값 이용시 (제외/~까지)
        for (int i = 0; i < coffes.length; i++) {
            coffes [2] = "latte";
            if (i < coffes.length -1) {
                System.out.print(coffes[i] + "하나, ");
            }
            if (i == coffes.length-1){
                System.out.print(coffes[i] + "하나");
            }
        }
        System.out.print("주세요");
        System.out.println("");
        int i=0;
        while (i < coffes.length){
            coffes [2] = "latte";
            System.out.println(coffes[i] + "하나");
            i += 1;
        }
        System.out.println("주세요");

        // enhanced for (for-each) 반복문 모든 요소 순회시
        for (String cof : coffes) {
            System.out.print(cof + "하나");
            System.out.println(",");
        }
        System.out.println("주소");

        for (String cof :
                coffes) {
            System.out.println(cof + " 하나");
        }
        System.out.println("줄래");
    }
}
