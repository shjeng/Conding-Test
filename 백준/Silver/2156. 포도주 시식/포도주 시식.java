import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static int n;
    private static int[] wine;
    private static int[] dp;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        n = Integer.parseInt(sc.nextLine());
        wine = new int[n + 1];
        dp = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            wine[i] = Integer.parseInt(sc.nextLine());
        }
        dp[1] = wine[1];

        if (n > 1) {
            // 와인 2개
            dp[2] = wine[2] + wine[1];

            // 와인이 3개 이상일 경우
            if (n > 2) {
                int max = Math.max(dp[1], wine[2]) + wine[3];
                dp[3] = Math.max(max, dp[2]);
            }
            ;
            // 와인이 그 4개 이상일 경우
            if (n > 3) {
                solution(4);
            }
        }
        System.out.println(Arrays.stream(dp).max().getAsInt());
    }

    public static void solution(int index) {
        if (n >= index) {
            int max = Math.max(dp[index - 2], dp[index - 3] + wine[index - 1]) + wine[index];
            dp[index] = Math.max(max, dp[index - 1]);
            solution(index + 1);
        }
    }

}

