package 배열.등수구하기;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int[] score = new int[num];
        for(int i=0;i<num;i++){
            score[i] = scan.nextInt();
        }
        for(int i=0;i<num;i++){
            int answer = num;
            for(int j=0;j<num;j++){
                if(j==i) continue;
                if(score[i]>=score[j]) answer--; // 입력받은 숫자를 2중 for문으로 풀었다.
            }
            System.out.print(answer + " ");
            answer = num;
        }
    }
}
