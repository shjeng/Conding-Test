import java.io.IOException;
import java.util.Scanner;

public class Main {

    private static int n;
    private static int[] dp;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        n = Integer.parseInt(sc.nextLine());
        dp = new int[n+1];
        dp[1] = 1;
        if (n > 1) {
            dp[2] = 3;
        }
        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i - 2] * 2 + dp[i - 1]) % 10007;
        }
        
        System.out.println(dp[n]);
    }

}

