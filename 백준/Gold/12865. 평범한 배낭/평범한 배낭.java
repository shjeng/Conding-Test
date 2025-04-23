import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static int[] W;
    private static int[] V;
    private static Integer[][] dp;


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] readLine = bufferedReader.readLine().split(" ");
        int N = Integer.parseInt(readLine[0]);
        int K = Integer.parseInt(readLine[1]);


        dp = new Integer[N + 1][K + 1];
        W = new int[N + 1];
        V = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            readLine = bufferedReader.readLine().split(" ");
            W[i] = Integer.parseInt(readLine[0]);
            V[i] = Integer.parseInt(readLine[1]);
        }
        System.out.println(knapsack(N, K));
    }

    public static int knapsack(int index, int K) {
        if (index < 1) {
            return 0;
        }
        if (dp[index][K] == null) {
            // 체크를 안했을 때
            if (W[index] > K) {
                dp[index][K] = knapsack(index - 1, K);
            } else if (W[index] <= K) {
                int value1 = knapsack(index - 1,K);
                int value2 = knapsack(index-1, K - W[index]) + V[index];
                dp[index][K] = Math.max(value1, value2);
            }
        }
        return dp[index][K];
    }

}

