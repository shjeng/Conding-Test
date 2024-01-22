package 문자열.중복문자제거;

import java.util.Scanner;

public class Main {
    public String solution(String str){
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = str.toCharArray();
        for(int i=0;i<str.length();i++){
            int count = 0;
            for(int j=i-1;j>=0;j--){
                if(chars[j] == chars[i]) count++;
            }
            if(count==0){
                stringBuilder.append(chars[i]);
            }
        }
        return stringBuilder.toString();
    }
    public static void main(String[] args) {
        Main m = new Main();
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(m.solution(str));
    }
}
