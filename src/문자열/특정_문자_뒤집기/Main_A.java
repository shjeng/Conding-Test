package 문자열.특정_문자_뒤집기;

import java.util.Scanner;

public class Main_A {
    public String solution(String str){
        String answer;
        char[] s = str.toCharArray();
        int lt=0, rt = str.length()-1;
        while(lt<rt){
            if(!Character.isAlphabetic(s[lt])) lt++;
            else if (!Character.isAlphabetic(s[rt])) rt--;
            else{
                char tmp=s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(s);
        return answer;
    }
    // Character.isAlphabetic()

    public static void main(String[] args) {
        Main_A T = new Main_A();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
