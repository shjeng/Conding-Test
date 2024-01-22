package 문자열.문자찾기;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] chars = scanner.nextLine().toUpperCase().toCharArray();
        char c = scanner.nextLine().toUpperCase().charAt(0);
        int count = 0;
        for(char ch : chars){
            if(ch == c) count++;
        }
        System.out.println(count);
    }
}
