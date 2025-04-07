package dynamic_programming.설탕배달;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 완전탐색 {

    private static int answer = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        완전탐색.solution(N, 0);
        if (answer > 5000) {
            answer = -1;
        }
        System.out.println(answer);
        br.close();
    }

    private static void solution(int N, int count) {
        if (N == 0) {
            answer = Math.min(count, answer);
        }
        if (N > 0) {
            완전탐색.solution(N-5, count + 1);
            완전탐색.solution(N - 3, count + 1);
        }
    }

}
