package 문자열.유효한_팰린드롬;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println(Main.solution(str));
    }
    public static String solution(String str){
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(Character.isAlphabetic(c)){
                c = Character.toUpperCase(c);
                stringBuilder.append(c);
            }
        }
        String str1 = stringBuilder.toString();
        String reStr = stringBuilder.reverse().toString();

        return str1.equals(reStr) ? "YES" : "NO";
    }
}
