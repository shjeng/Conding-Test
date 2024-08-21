import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        long min = Long.parseLong(st.nextToken());
        long max = Long.parseLong(st.nextToken());
        boolean[] check = new boolean[(int) (max - min + 1)];
        int answer = 0;

        for (long i = 2; i * i <= max; i++) {
            long square = i * i;
            long start = (min / square) * square;
            if (start < min) {
                start += square;
            }
            for (long j = start; j <= max; j += square) {
                check[(int) (j - min)] = true;
            }
        }

        for (int i = 0; i <= (int) (max - min); i++) {
            if (!check[i]) {
                answer++;
            }
        }

        System.out.println(answer);
    }
}