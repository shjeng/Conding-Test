import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int[][] nums = new int[31][31];
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < T; i++) {
            StringTokenizer sto = new StringTokenizer(bufferedReader.readLine());
            int N = Integer.parseInt(sto.nextToken());
            int M = Integer.parseInt(sto.nextToken());
            System.out.println(Main.answer(N, M));
        }
    }

    public static int answer(int N, int M) {
        if (nums[N][M] > 0) {
            return nums[N][M];
        }
        if (N == M || N == 0) {
            return nums[N][M] = 1;
        } else {
            return nums[N][M] = answer(N - 1, M - 1) + answer(N, M - 1);
        }
    }
}