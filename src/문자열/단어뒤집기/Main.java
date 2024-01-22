package 문자열.단어뒤집기;

import java.util.Scanner;

public class Main {
    public String solution(String str){
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
            stringBuilder.append(str.charAt(i));
        }
        return stringBuilder.toString();
    }
    public static void main(String[] args) {
        Main m = new Main();
        Scanner scan = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        int num = scan.nextInt();
        for(int i=0;i<num;i++){
            String str = scan.next();
            stringBuilder.append(m.solution(str) + "\n");
        }
        System.out.println(stringBuilder.toString());

    }
}
