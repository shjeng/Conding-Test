import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine()); // 반복 횟수
        int[] score = new int[n + 1]; // 숫자 담아줌
        int[] dp = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            score[i] = Integer.parseInt(bufferedReader.readLine());
        }
        dp[1] = score[1];
        if (n > 1) {
            dp[2] = score[2] + score[1];
        }

        for (int i = 3; i <= n; i++) {
            dp[i] = Math.max(dp[i - 2], dp[i - 3] + score[i - 1]) + score[i];
        }
        System.out.println(dp[n]);
    }


    /*현재위치 i
    dp[1] = score[1];
    dp[2] = score[1] + score[2];
    dp[3] = Max(dp[1], score[2]) + score[i];
    dp[4] = Max[dp[2], dp[1] + score[3] + score[4]
    dp[5] = Max[dp[3], dp[2] + score[4] + score[5]
    * */

}
