package 문자열.문자열_압축;

import java.util.Scanner;

public class Main_A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(Main_A.solution(str));
    }
    public static String solution(String s){
        String answer = "";
        s += " ";
        int cnt = 1;
        for(int i=0;i<s.length()-1;i++){ // aabcc 4 i = 0 1 2 3
            if(s.charAt(i)==s.charAt(i+1)) {
                cnt++;
            } else {
                answer += s.charAt(i);
                if(cnt>1) answer += String.valueOf(cnt);
                cnt=1;
            }
        }
        System.out.println(s.length());
        return answer;
    }
}
