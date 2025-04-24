import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    private static int[] W;
    private static int[] V;
    private static Integer[][] dp;


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String readLine = bufferedReader.readLine();
        int N = Integer.parseInt(readLine);
//213895818
//859193326
        long[][] dp = new long[N + 1][10];
        Arrays.fill(dp[1], 1);
        dp[1][0] = 0;
        for (int i = 2; i <= N; i++) {
            for (int j = 0; j < 10; j++) {
                if(j == 0) {
                    dp[i][j] = ( dp[i-1][j+1]) % 1000000000;
                } else if (j == 9) {
                    dp[i][j] = dp[i-1][j-1] % 1000000000;
                } else {
                    dp[i][j] = (dp[i-1][j-1] + dp[i-1][j+1]) % 1000000000;
                }
            }
        }
        System.out.println(Arrays.stream(dp[N]).sum() % 1000000000);
    }


}

