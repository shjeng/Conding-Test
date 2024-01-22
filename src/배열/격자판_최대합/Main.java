package 배열.격자판_최대합;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int[][] binggo = new int[num][num];

        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                binggo[i][j] = scan.nextInt();
            }
        }

        int max = 0;
        for(int i=0;i<num;i++){
            int sum = 0, sum2 = 0;
            for(int j=0;j<num;j++){
                sum += binggo[i][j]; // 행의 합 [0][1] 2 3 4 5
                sum2 += binggo[j][i]; // 열의 합
            }
            max = Math.max(max,sum);
            max = Math.max(max,sum2);
        }
        int sum = 0;
        int sum2 = 0;
        int k = num - 1;
        for(int i=0;i<num;i++){
            sum += binggo[i][i];
            sum2 += binggo[i][k];
            k--;
        }
        max = Math.max(max,sum); // 왼쪽 위부터 시작하는 대각선의 합
        max = Math.max(max,sum2); // 왼쪽 아래부터 시작하는 대각선의 합


        System.out.println(max);
    }
}
