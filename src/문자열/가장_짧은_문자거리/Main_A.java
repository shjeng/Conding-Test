package 문자열.가장_짧은_문자거리;

import java.util.Scanner;

public class Main_A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        char c = scan.next().charAt(0);
        for (int x: Main_A.solution(str,c)){
            System.out.println(x + " ");
        }
    }

    public static int[] solution(String s, char t){
        int[] answer = new int[s.length()];
        int p = 1000; // 거리 최대값 미리 설정
        for(int i=0; i<s.length();i++){
            if(s.charAt(i) == t){
                p=0; // 거리
                answer[i] = p;
            } else{
                p++; // 거리 증가
                answer[i] = p;
            }
        }
         p = 1000;
        for(int i=s.length()-1; i>=0;i--){
            if(s.charAt(i) == t){
                p=0;
            } else{
                p++;
                answer[i] = Math.min(answer[i],p);
            }
        }
        return answer;
    }
}
