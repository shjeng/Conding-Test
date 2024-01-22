package 문자열.유효한_팰린드롬;

import java.util.Scanner;

public class Main_A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println(Main_A.solution(str));
    }

    public static String solution(String str){
        String answer = "NO";
        str = str.toUpperCase().replaceAll("[^A-Z]","");
                                // ^는 부정. 'A-Z가 아니면' ""로 바꾸는 정규식.
        String tmp = new StringBuilder(str).reverse().toString();
        if(str.equals(tmp)){
            return "YES";
        }
        return answer;
    }
}
