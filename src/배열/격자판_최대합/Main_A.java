package 배열.격자판_최대합;

import java.util.Scanner;

public class Main_A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = scan.nextInt();
            }
        }
        System.out.println(Main_A.solution(n,arr));
    }
    public static int solution(int n, int[][] arr){
        int answer = Integer.MIN_VALUE;
        int sum1, sum2;
        for(int i=0;i<n;i++){
            sum1=sum2=0;
            for(int j=0;j<n;j++){
                sum1 += arr[i][j]; // 행의 합
                sum2 += arr[j][i]; // 열의 합
            }
            answer=Math.max(answer,sum1);
            answer=Math.max(answer,sum2);
        }
        sum1=sum2=0;
        for(int i=0;i<n;i++){
            sum1 += arr[i][i]; // 1행1열부터 시작하는 대각선의 합
            sum2 += arr[i][n-i-1]; // n=5인 경우에 1열 5행부터 시작하는 대각선.
        }
        answer=Math.max(answer,sum1);
        answer=Math.max(answer,sum2);
        return answer;
    }
}
