import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bufferedReader.readLine()); // 2사람

        int[] nums = new int[T * 2];

        int maxK = 0;
        int maxN = 0;
        for (int i = 0; i < T*2; i+=2) {
            int k = Integer.parseInt(bufferedReader.readLine());
            int n = Integer.parseInt(bufferedReader.readLine());
            nums[i] = k;
            nums[i+1] = n;
            maxK = Math.max(maxK, k);
            maxN = Math.max(maxN, n);
        }

        int[][] dp = new int[maxK+1][maxN+1];

        /* 피보나치 수열을 먼저 만들어줌 */
        dp[1][1] = 1;


        if (maxN > 1) {
            for (int i = 2; i <= maxN; i++) {
                dp[1][i] = dp[1][i - 1] + i;
            }

            for (int j = 2; j <= maxK; j++) { // k가 층 j == 3일 때
                dp[j][1] = 1; // 2층 1호실은 1 ,,
                for (int i = 2; i <= maxN; i++) { // 32 = 2 1 + 22
                    dp[j][i] = dp[j][i - 1] + dp[j-1][i]; // 2층 2호실은 1층의 1호실 + 1층의 2호실
                }

            }
        }

        // 1 2 3 = 6
        // 1 3 6 = 10
        for (int i = 0; i < T*2; i+=2) {
            System.out.println(dp[nums[i]][nums[i+1]]);
        }

    }
}
