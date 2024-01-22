package 문자열.대소문자변환;

import java.util.Scanner;

public class Main {

    public static String answer(String str){
        StringBuilder sb = new StringBuilder();
        char[] chars = str.toCharArray();
        for(char c : chars){
            char ch = Character.toUpperCase(c);
            if(c == ch){
                sb.append(Character.toLowerCase(c));
            } else{
                sb.append(Character.toUpperCase(c));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.next();
        System.out.println(answer(str1));
    }
}
