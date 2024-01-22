package 문자열.중복문자제거;

import java.util.Scanner;

public class Main_A {
    public String solution(String str){
        String answer="";
        for(int i=0;i<str.length();i++){
            if(str.indexOf(str.charAt(i)) == i){
                // indexOf(char) : char이 위치한 문자열을 반환
                answer += str.charAt(i);
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Main_A T = new Main_A();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
