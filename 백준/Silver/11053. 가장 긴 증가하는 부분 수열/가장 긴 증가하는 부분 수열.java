import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        int[] A = new int[N];
        int[] dp = new int[N];
        String[] numsStr = bufferedReader.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(numsStr[i]);
            dp[i] = 1;
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i; j++) {
                if (A[i] > A[j ] && dp[i] < dp[j] + 1) {
                    /*크다면~ */
                    dp[i] = dp[j] + 1;
                }
            }
        }
        int answer = Arrays.stream(dp).max().getAsInt();
        System.out.println(answer);
        bufferedReader.close();
    }


}

