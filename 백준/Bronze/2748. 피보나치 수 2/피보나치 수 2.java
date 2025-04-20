import java.io.IOException;
import java.util.Scanner;

public class Main {

    private static int n;
    private static Long[] dp;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        n = Integer.parseInt(sc.nextLine());
        dp = new Long[91];
        dp[0] = 0L;
        dp[1] = 1L;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        
        System.out.println(dp[n]);
    }

}

