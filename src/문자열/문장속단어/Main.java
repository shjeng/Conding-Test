package 문자열.문장속단어;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public String solution(StringTokenizer sto){
        String answer = sto.nextToken();
        int length = answer.length();
        while(sto.hasMoreTokens()){
            String stoStr = sto.nextToken();
            if(length<stoStr.length()){
                answer = stoStr;
                length = answer.length();
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Main my = new Main();
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        StringTokenizer sto = new StringTokenizer(str);
        System.out.println(my.solution(sto));
    }
}
