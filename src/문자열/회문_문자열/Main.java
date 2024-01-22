package 문자열.회문_문자열;

import java.util.Scanner;

public class Main {
    public String solution(String str){
        str = str.toUpperCase();
        StringBuilder stringBuilder = new StringBuilder(str).reverse();
        return str.contentEquals(stringBuilder)? "YES" : "NO";
    }
    public static void main(String[] args) {
        Main m = new Main();
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(m.solution(str));
    }
}
