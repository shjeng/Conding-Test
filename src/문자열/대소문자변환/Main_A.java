package 문자열.대소문자변환;

import java.util.Scanner;

public class Main_A {
    public String solution(String str){
        String answer = "";
        char aa = 'z';
        System.out.println(aa-0);
        for (char x : str.toCharArray()){
            if(Character.isLowerCase(x)) answer += Character.toUpperCase(x);
            else answer += Character.toLowerCase(x);
        }
        return answer;
    }
    public static void main(String[] args) {
        Main_A T = new Main_A();
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(T.solution(str));
    }
}
// StringBuilder가 좋음 .
// 아스키 코드로 푸는 방법도 있음. 대문자는 65부터, 소문자는 97부터
