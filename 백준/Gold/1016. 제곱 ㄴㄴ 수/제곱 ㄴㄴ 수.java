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

        //  에라토스체네스의 체를 사용해야함.
        // max가 1조까지 있기 때문에 int를 사용하면 안 됨.
        // 시간 제한이 있기 때문에 처음부터 세면 안 됨.

        for (long i = 2; i * i <= max; i++) {
            long square = i * i; // 7  4
            long start = (min / square) * square;
            if (start < min) {
                start += square;
            }
            for (long j = start ; j <= max;  j += square) {
                check[(int) (j - min)] = true;
            }
        }

        for (int i = 0; i <= (int) (max - min); i++) {
            answer = check[i] ? answer  : answer+1;
        }

        System.out.println(answer);
    }
}