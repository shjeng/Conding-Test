package 문자열.숫자만_추출;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(m.solution(str));
    }
    public int solution(String str){
        StringBuilder stringBuilder = new StringBuilder();
        int answer;
        for(int i=0;i<str.length();i++){
            if(!Character.isAlphabetic(str.charAt(i))){
                stringBuilder.append(str.charAt(i));
            }
        }

        answer = Integer.parseInt(stringBuilder.toString());
        return answer;
    }

}
