package Chap_09;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class _04_ArrayList {
    public static void main(String[] args) {
        // 컬렉션 프레임워크 (List, Set, Map)
        ArrayList<String> list = new ArrayList<>();
        
        //데이터 추가
        list.add("말");
        list.add("돼지");
        list.add("소");
        list.add("강아지");
        list.add("고양이");

        //데이터 조회 (인덱스)
        for (int i = 0; i < 5; i++) {
                System.out.println(list.get(i));
            }

        // 삭제
        System.out.println("동물 수 (이사 전) : " + list.size());
        list.remove("소");
        System.out.println("동물 수 (이사 후) : " + list.size());
        System.out.println(list.get(2));
        System.out.println("남은 동물 수 (제외 전) : " + list.size());
        list.remove(list.size() - 1);
        System.out.println("남은 동물 수 (제외 후) : " + list.size());

        //순회
        for (String s : list) {
            System.out.println(s);
        }

        // 변경
        System.out.println("변경 전 : " + list.get(0));
        list.set(0, "고양이");
        System.out.println("변경 후 : " + list.get(0));
        
        //확인
        System.out.println(list.indexOf("강아지"));
        
        // 5개 안에 포함되었는가?
        if (list.contains("강아지")) {
            System.out.println("포함");
        } else {
            System.out.println("불포함");
        }

        // 전체 삭제
        list.clear();
        if (list.isEmpty()) {
            System.out.println("동물 수 : " + list.size());
            System.out.println("없음");
        }
//        System.out.println(list.size());

        // 다음 동물원
        list.add("말");
        list.add("돼지");
        list.add("소");
        list.add("강아지");
        list.add("고양이");

        // 정렬
        Collections.sort(list);
        for (String s :
                list) {
            System.out.println(s);
        }
    }
}
