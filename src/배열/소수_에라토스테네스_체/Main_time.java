package 배열.소수_에라토스테네스_체;

import java.util.Scanner;

public class Main_time {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        int answer = 0;
        for(int i=2; i<=num;i++){
            int j = 2;
            int count = 0;
            while (j<i){
                if(i%j==0) count++;
                if(count>0) break;
                j++;
            }
            if(count==0) answer++;
            count=0;
        }
        System.out.println(answer);
    }
} // Time Limit Exceeded, 시간 초과
