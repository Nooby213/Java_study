package Chap_09;

import java.util.HashMap;
import java.util.HashSet;

public class _07_HashMap {
    public static void main(String[] args) {
        // 맵 : Key, Value 쌍으로 이루어진
        HashMap<String, Integer> map = new HashMap<>();
        
        // 데이터 추가
        map.put("이승민", 10);
        map.put("강민정", 1);
        map.put("고현의", 8);
        map.put("박현순", 2);
        System.out.println("고객 수 : " + map.size());
        
        // 조회
        System.out.println("이승민의 포인트 : " + map.get("이승민"));
        System.out.println("박현순의 포인트 : " + map.get("박현순"));

        // 확인
        if (map.containsKey("강민정")) {
            int point = map.get("강민정");
            map.put("강민정", ++point);
            System.out.println("강민정님의 누적 포인트 : " +map.get("강민정"));
        } else {
            map.put("강민정", 1);
            System.out.println("신규 고객 등록 (포인트 1)");
        }
        
        // 삭제
        map.remove("박현순");
        System.out.println(map.get("박현순"));
        
        // 전체 삭제
        map.clear();
//        map.put("고현의", 8);
        if (map.isEmpty()) {
            System.out.println("가게 망했다 ㅠㅠ");
        } else {
            System.out.println("고객 수 : " + map.size());
        }
        
        // 확인
        map.put("이승민", 10);
        map.put("강민정", 1);
        map.put("고현의", 8);
        map.put("박현순", 2);
        for (String key :
                map.keySet()) {
            System.out.println(key);
        }
        for (int value :
                map.values()) {
            System.out.println(value);
        }

        // Key, Value 한 번에 확인
        for (String key :
                map.keySet()) {
            System.out.println("고객 이름 : " + key + "\t/포인트 : " + map.get(key));
        }
        System.out.println("-------");
        // map 중복x 순서x \\ 순서 보장 하고 싶으면 Linked
        map.put("고현의", 2);
        map.put("고현의", 123);
        map.put("고현의", 1);  // 최종 입력값이 뜬다.
        for (String key :
                map.keySet()) {
            System.out.println("고객 이름 : " + key + "\t/포인트 : " + map.get(key));
        }
    }
}
