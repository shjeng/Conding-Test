import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        // 라인을 먼저 구해야함.
        // 라인은 1, 3, 6, 10 이런 식으로
        int line = 1;
        int sum = 0;

        while (sum + line < N) {
            sum += line;
            line++;
        }

        int pos = N - sum;
        // T는 분자와 분모가 합한 값
        int numerator, denominator;

        if (line % 2 == 0) {
            // 짝수 라인 → 아래에서 위로 올라감
            numerator = pos;
            denominator = line - pos + 1;
        } else {
            // 홀수 라인 → 위에서 아래로 내려감
            numerator = line - pos + 1;
            denominator = pos;
        }

        System.out.println(numerator + "/" + denominator);
        br.close();
    }

}
