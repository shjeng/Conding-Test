package 문자열.암호;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String str = scanner.next();
        System.out.println(Main.solution(str, num));
    }

    public static String solution(String str, int num){
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0;i<num;i++){
            String substring = str.substring((i * 7), (i + 1) * 7); //
            char ch;
            int v = 0;
            for(int j=0;j<7;j++){
                int num2 = 0;
                char c = substring.substring(j, j + 1).charAt(0);
                if(c == '#') num2 = 1;
                v = v + ((int)Math.pow(2,6-j) * num2);
            }
            ch = (char) v;
            stringBuilder.append(ch);
            v = 0;
        }
        return stringBuilder.toString();
    }
}
