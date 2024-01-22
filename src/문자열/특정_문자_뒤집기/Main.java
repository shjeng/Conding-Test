package 문자열.특정_문자_뒤집기;

import java.util.Scanner;

public class Main {
    public static String solution(String str){
        char[] chars = str.toCharArray();
        int end = str.length()-1;
        for(int i=0;i<end;i++){
            if(Character.toUpperCase(chars[i]) == Character.toLowerCase(chars[i])){
                continue;
            }
            if(Character.toUpperCase(chars[end]) == Character.toLowerCase(chars[end])){
                // i--; 를 처음에 빼먹음
                i--;
                end--;
                continue;
            }
            char tmp = chars[i];
            chars[i] = chars[end];
            chars[end] = tmp;
            end--;
        }
        String answer = String.valueOf(chars);
        return answer;
    }
    public static void main(String[] args) {
        Main m = new Main();
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(m.solution(str));

    }
}
