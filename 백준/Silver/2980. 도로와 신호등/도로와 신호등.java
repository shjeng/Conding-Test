import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer sto = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(sto.nextToken()); // N : 신호등의 개수
        int L = Integer.parseInt(sto.nextToken()); // 도로의 길이

        int waitingTime = 0;
        for (int i = 0; i < N; i++) {
            sto = new StringTokenizer(bufferedReader.readLine());
            int D = Integer.parseInt(sto.nextToken()); // 신호등의 위치
            int R = Integer.parseInt(sto.nextToken()); // 빨간불 시간
            int G = Integer.parseInt(sto.nextToken()); // 초록불 시간
            int remainder = (D + waitingTime) % (R+G);
            if (remainder < R) {
                L += R - remainder;
                waitingTime += R - remainder;
            }
        }
        System.out.println(L);
    }
}