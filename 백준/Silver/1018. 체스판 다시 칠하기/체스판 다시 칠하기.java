import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String sizeStr = bufferedReader.readLine();
        String[] sizeSplit = sizeStr.split(" ");

        int n = Integer.parseInt(sizeSplit[0]);
        int answer = 64;
        String[] chess = new String[n];
        for (int i = 0; i < n; i++) {
            chess[i] = bufferedReader.readLine();
        }
        bufferedReader.close();
        int m = Integer.parseInt(sizeSplit[1]);

        for (int i = 0; i <= n - 8; i++) {
            for (int j = 0; j <= m - 8; j++) { // m이 13이면 5번 옮겨야돼. 근데 13- 8 = 5 0,1,2,3,4,5
                answer = Math.min(answer, Main.solution(j, i, chess));
            }
        }

        System.out.println(answer);
    }

    public static int solution(int startRow, int startCol, String[] chess) {
        int count = 0;
        boolean isW = true;
        for (int i = startCol; i < 8 + startCol; i++) {
            String c = chess[i];
            for (int j = startRow; j < 8 + startRow; j++) {
                char ch = c.charAt(j);
                if (isW && ch == 'B') {
                    count++;
                } else if (!isW && ch == 'W') { // isW가 아니고 W인 경우
                    count++;
                }
                isW = !isW;
            }
            isW = !isW;
        }
        return Math.min(count, 64 - count);
    }
    /*
     * 1. 체스판 자르기
     * 2. 현 체스판의 최소 비용 구하기
     * 3. 전체 최적의 값과 비교하여 갱신하기
     * */
}