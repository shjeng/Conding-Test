package hubdnc;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 소수의_합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String questionStr = br.readLine();
        System.out.println(소수의_합.solution(questionStr));
        br.close();
    }
    public static int solution(String inputStr) {
        int num = Integer.parseInt(inputStr);

        boolean noSosu[] = new boolean[num + 1];

        for (int i = 2; i <= num; i++) {
            for (int j = i+i; j <= num; j += i) {
                /* 소수가 아님 */
                noSosu[j] = true;
            }
        }

        int answer = 0;
        for (int i = 2; i <= num; i++) {
            if (noSosu[i]) continue;
            answer += i;
        }
        return answer;
    }
}
