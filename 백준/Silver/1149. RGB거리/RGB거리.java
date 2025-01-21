import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());

        int[][] dp = new int[N][3];

        int[][] cost = new int[N][3];

        for (int i = 0; i <N ; i++) {
            String str = bufferedReader.readLine();
            String[] strs = str.split(" ");
            // 집 가격
            cost[i][0] = Integer.parseInt(strs[0]);
            cost[i][1] = Integer.parseInt(strs[1]);
            cost[i][2] = Integer.parseInt(strs[2]);
        }
        dp[0][0] = cost[0][0];
        dp[0][1] = cost[0][1];
        dp[0][2] = cost[0][2];

        for (int i = 1; i < N; i++) {
            dp[i][0] = Math.min(dp[i - 1][1], dp[i - 1][2]) + cost[i][0];
            dp[i][1] = Math.min(dp[i - 1][0], dp[i - 1][2]) + cost[i][1];
            dp[i][2] = Math.min(dp[i - 1][0], dp[i - 1][1]) + cost[i][2];
        }
        int minCost = Math.min(dp[N - 1][0], dp[N - 1][1]);
        minCost = Math.min(minCost, dp[N - 1][2]);
        System.out.println(minCost);
    }

    /*
    * 2번째 집의 빨강 최소값은 1번째 집의 파랑 + 그린
    * 즉 dp[1][0] = dp[0][1] + dp[0][2];
    * */
}