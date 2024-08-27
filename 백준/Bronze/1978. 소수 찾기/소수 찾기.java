import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer sto = new StringTokenizer(bufferedReader.readLine());
        boolean check[] = new boolean[1001];
        int N = Integer.parseInt(sto.nextToken());
        check[1] = true;
        sto = new StringTokenizer(bufferedReader.readLine());

        for (int i = 2; i < 1001; i++) {
            if(check[i] == true) continue;
            for (int j = i+i; j < 1001; j +=i) {
                check[j] = true;
            }
        }

        int answer = 0;
        for (int i = 0; i < N; i++) {
            if (!check[Integer.parseInt(sto.nextToken())]) {
                answer++;
            }
        }
        System.out.println(answer);
    }

}