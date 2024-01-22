package 문자열.암호;

import java.util.Scanner;

public class Main_A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String str = scan.next();
        System.out.println(Main_A.solution(n,str));
    }
    public static String solution(int n, String s){
        String answer = "";
        for(int i=0; i<n; i++){
            String tmp = s.substring(0,7).replace('#','1').replace('*','0');
            int num = Integer.parseInt(tmp,2); // 주어진 2진수 문자열을 10진수 정수로 변환해줌
            answer += (char) num;
            s = s.substring(7);
        }
        return answer;
    }
}
