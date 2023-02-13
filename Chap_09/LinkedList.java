package Chap_09;

import java.util.Collections;

public class LinkedList {
    public static void main(String[] args) {
        // 링크드 리스트
        java.util.LinkedList<String> list = new java.util.LinkedList<>();

        //데이터 추가
        list.add("말");
        list.add("돼지");
        list.add("소");
        list.add("강아지");
        list.add("고양이");

        // 데이터 조회
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println("_______________");
        // 추가
        list.addFirst("기린");
        for (String s :
                list) {
            System.out.println(s);
        }
        System.out.println("_______________");
        list.addLast("코끼리");
        for (String s :
                list) {
            System.out.println(s);
        }
        System.out.println("_______________");
        list.add(1, "사자");
        for (String s :
                list) {
            System.out.println(s);
        }

        // 삭제
        list.remove(list.size() - 1);
//        for (String s :
//                list) {
//            System.out.println(s);
//        }

        // 첫번째와 마지막 한 번에 삭제
        System.out.println(list.size());
        list.removeFirst();
        list.removeLast();
        System.out.println(list.size());

        // 변경
        list.set(0,"망아지");
        System.out.println(list.get(0));

        //확인
        System.out.println(list.indexOf("고양이"));
        if (list.contains("고양이")) {
            System.out.println("O");
        } else {
            System.out.println("X");
        }

        //전체 삭제
        list.clear();
        if (list.isEmpty()) {
            System.out.println(list.size());
            System.out.println("XXXXXXXXX");
        }

        //새로
        list.add("말");
        list.add("돼지");
        list.add("소");
        list.add("강아지");
        list.add("고양이");
        Collections.sort(list);
        for (String s :
                list) {
            System.out.println(s);
        }
    }
}
