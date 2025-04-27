import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    private static Integer[] dp;
    private static int[][] TP;
    private static int N;


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String readLine = bufferedReader.readLine();
        N = Integer.parseInt(readLine);

        dp = new Integer[N];
        TP = new int[N][2];

        for (int i = 0; i < N; i++) {
            String[] numsStr = bufferedReader.readLine().split(" ");
            TP[i][0] = Integer.parseInt(numsStr[0]); // 소요 시간
            TP[i][1] = Integer.parseInt(numsStr[1]); // 값
        }
        soluntion(0);
        Integer answer = Arrays.stream(dp).max(Comparator.naturalOrder()).get();
        System.out.println(answer);
    }

    public static int soluntion(int index) {
        if (index >= N) {
            return 0;
        }
        if (index + TP[index][0] > N) {
            dp[index] = soluntion(index + 1);
        } else if (dp[index] == null) {
            // 체크를 안 한
            dp[index] = Math.max(
                    TP[index][1] + soluntion(index + TP[index][0]),
                    soluntion(index + 1)
            );
        }
        return dp[index];
    }

}

