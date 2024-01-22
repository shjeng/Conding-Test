package 문자열.숫자만_추출;

import java.util.Scanner;

public class Main_A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(Main_A.solution(str));
    }

    public static int solution(String s){
        int answer=0;
        for(char x : s.toCharArray()){
            if(x>=48 && x<=57){
                // 문자 '0' ~ '9' = 숫자 48 ~ 57
                answer = answer * 10 + (x-48);
            }
        }
        return answer;
    }
}
