package 배열.피보나치_수열;

import java.util.Scanner;

public class Main_A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for(int x : Main_A.solution(num)) System.out.print(x + " ");
    }
    public static int[] solution(int n){
        int[] answer = new int[n];
        answer[0] = 1;
        answer[1] = 1;
        for(int i=2; i<n; i++){
            answer[i] = answer[i-2] + answer[i-1];
        }
        return answer;
    }
}
