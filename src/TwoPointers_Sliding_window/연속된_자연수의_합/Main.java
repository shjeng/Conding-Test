package TwoPointers_Sliding_window.연속된_자연수의_합;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int answer = 0;

        int lt = 1;
        int rt = 2;
        int sum = 3;
        for(int i=0;i<N;i++){
            if(sum==N){
                answer++;
                sum -= lt++;
                sum += ++rt;
            }
            if(sum>N){ // 클 때
                sum -= lt++;
            } else{ // 작을 때
                sum += ++rt;
            }
        }
        System.out.println(answer);
    }
}
