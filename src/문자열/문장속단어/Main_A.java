package 문자열.문장속단어;

import java.util.Scanner;

public class Main_A {

    public String solution(String str){
        String answer = "";
        int m = Integer.MIN_VALUE;
        String[] s = str.split(" ");
        for(String x : s){
            int len = x.length();
            if(len>m){
                m=len;
                answer=x;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main_A T = new Main_A();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));
    }
}
