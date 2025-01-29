import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] str = bufferedReader.readLine().split(" ");
        int N = Integer.parseInt(str[0]); // 카드 갯수 N
        int M = Integer.parseInt(str[1]); // 합

        String[] cardsStr = bufferedReader.readLine().split(" ");
        int[] cards = new int[N];
        for (int i = 0; i < N; i++) {
            cards[i] = Integer.parseInt(cardsStr[i]);
        }

        int answer = 0;

        for (int i = 0; i < N - 2; i++) {
            if (answer == M) break;
            int temp = 0;
            for (int j = i+1; j < N - 1; j++) {
                if (answer == M) break;
                for (int k = j + 1; k < N; k++) {
                    temp = cards[i] + cards[j] + cards[k];
                    if (temp == M || answer == M) {
                        answer = temp;
                        break;
                    }
                    if (temp < M && temp > answer) {
                        answer = temp;
                    }
                }
            }
        }
        System.out.println(answer);
    }
}