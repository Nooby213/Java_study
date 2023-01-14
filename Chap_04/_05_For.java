package Chap_04;

public class _05_For {
    public static void main(String[] args) {
//        // For 반복문   fori만 적고 엔터 치면 자동완성
//        System.out.println("Hi, this is Lee");
//        System.out.println("Hi, this is Lee");
//        System.out.println("Hi, this is Lee");
//        for(선언; 조건; 증감){
//      }
        for(int i = 0; i <= 10; i++){
            System.out.println("Hi, this is Lee" + (i+1));
        }
        
        //짝수만 출력
        for (int i = 0; i <10 ; i += 2) {
            System.out.println(i);// println에서 ln뺴면 줄바꿈없이
        }
        //홀수만 출력
        for (int i = 1; i < 10; i += 2) {
            System.out.print(i);
        }
        System.out.println("");
        //거꾸로 숫자
        for (int i = 5; i > 0; i--) {
            System.out.print(i);
        }
        int s = 0;
        for (int i = 1; i <= 10; i++) {
            s += i;
            System.out.println(s);
            }
        System.out.println("1부터 10까지 합은 " +s);
        }
    }
