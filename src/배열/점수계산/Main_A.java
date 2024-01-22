package 배열.점수계산;

import java.util.Scanner;

public class Main_A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        System.out.println(Main_A.solution(n,arr));
    }
    public static int solution(int n, int[] arr){
        int answer = 0, cnt = 0;
        for(int i=0;i<n;i++){
            if(arr[i] == 1){
                cnt++;
                answer+=cnt;
            } else cnt = 0;
        }
        return answer;
    }
}
