package 문자열.회문_문자열;

import java.util.Scanner;

public class Main_A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(Main_A.solution(str));
    }

    public static String solution(String str){
        String answer ="YES";
        str = str.toUpperCase();
        int len = str.length();
        for(int i=0;i<len/2;i++){
            if(str.charAt(i)!=str.charAt(len-i-1)){
                return "NO";
            }
        }
        return answer;
    }
}
