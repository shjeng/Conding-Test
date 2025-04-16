import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    private static int n;
    private static int[] nums;
    private static int[] dp;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        n = Integer.parseInt(sc.nextLine());
        StringTokenizer sto = new StringTokenizer(sc.nextLine());
        nums = new int[n];
        dp = new int[n];
        for (int i = 0; i < n; i++) {
            String s = sto.nextToken();
            int i1 = Integer.parseInt(s);
            nums[i] = i1;
            dp[i] = i1;
        }

        solution(1);
        System.out.println(Arrays.stream(dp).max().getAsInt());
    }

    public static void solution(int n){
        if (n != dp.length) {
            dp[n] = Math.max(dp[n], dp[n - 1] + nums[n]);
            solution(n + 1);
        }
    }
}

