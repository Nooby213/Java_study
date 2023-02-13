package Chap_09;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class _06_HashSet {
    public static void main(String[] args) {
        // 세트 : 중복 허용 x, 순서도 상관없이 나옴
        HashSet<String> set = new HashSet<>();
        set.add("삼겹살");
        set.add("상추");
        set.add("고추");
        set.add("소금");
        set.add("후추");
        set.add("나랑드");
        set.add("삼겹살");
        set.add("마늘");
        set.add("쌈장");
        set.add("삼겹살");
        System.out.println(set.size());

        for (String s :
                set) {
            System.out.println(s);
        }
        
        //확인
        if (set.contains("삼겹살")) {
            System.out.println("삼겹살 사자");
        }

        // 삭제
        System.out.println("구매 전 " + set.size());
        set.remove("삼겹살");
        System.out.println("구매 후 " + set.size());

        // 전체 삭제
        set.clear();
        if (set.isEmpty()) {
            System.out.println("장보기 끝");
        }

        HashSet<Integer> intSet = new HashSet<>();
        intSet.add(1);
        intSet.add(71);
        intSet.add(11);
        for (int i :
                intSet) {
            System.out.println(i);
        }
    }
}
