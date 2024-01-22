package 문자열.문자열_압축;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(Main.solution(str));
    }
    public static String solution(String str){

        StringBuffer stringBuffer = new StringBuffer();
        int count = 1;

        for(int i=1;i<str.length();i++){
            char c = str.charAt(i);
            if(c == str.charAt(i-1)){ // 전 글자와 같으면
                count ++ ;
            }
            if(c != str.charAt(i-1) ){
                stringBuffer.append(str.charAt(i-1));
                if(count != 1) stringBuffer.append(count);
                count = 1;
            }
            if(i == str.length()-1) {
                stringBuffer.append(c).append(count==1?"":count);
            }
        }
        return stringBuffer.toString();
    }
}
