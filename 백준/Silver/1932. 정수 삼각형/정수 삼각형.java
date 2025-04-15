import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int[][] dp = new int[n][n];
        dp[0][0] = Integer.parseInt(bufferedReader.readLine());


        // i = y, j = x
        for (int i = 1; i < n; i++) {
            String[] nums = bufferedReader.readLine().split(" ");
            for (int j = 0; j < nums.length; j++) {
                dp[i][j] = Integer.parseInt(nums[j]);
            }
            for (int j = 0; j < nums.length; j++) {
                int second = dp[i - 1][j] + dp[i][j];
                int max = second;
                if (j > 0) {
                    int first = dp[i - 1][j-1] + dp[i][j];
                    max = Math.max(max, first);
                }
                dp[i][j] = max;
            }
        }
        System.out.println(Arrays.stream(dp[n - 1]).max().getAsInt());
        bufferedReader.close();
    }

}

