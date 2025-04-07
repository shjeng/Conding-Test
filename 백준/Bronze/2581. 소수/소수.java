import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        boolean[] noSuso = new boolean[M + 1];
        for (int i = 2; i <= M; i++) {
            for (int j = i+i; j <= M ; j += i) {
                noSuso[j] = true;
            }
        }

        int sum = 0;
        int min = Integer.MAX_VALUE;
        for (int i = N; i <= M; i++) {
            if (i < 2) continue;
            if (!noSuso[i]){
                if (min > i) {
                    min = i;
                }
                sum += i;
            }
        }
        if (sum == 0) {
            System.out.println("-1");
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
        br.close();
    }

}
