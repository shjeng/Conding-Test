import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static java.util.Collections.sort;

public class Main {

    static int answer;
    static int[] answers;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder answer = new StringBuilder();

        String[] strs = new String[N];
        for (int i = 0; i < N; i++) {
            strs[i] = br.readLine();
        }

        for (int i = 0; i < strs[0].length(); i++) {
            String str = strs[0];
            char c = str.charAt(i);
            boolean noEq = true;
            for (int j = 1; j < N; j++) {
                char checkChar = strs[j].charAt(i);
                if (c != checkChar) {
                    noEq = false;
                    break;
                }
            }
            if (noEq) {
                answer.append(c);
            } else {
                answer.append("?");
            }
        }

        System.out.println(answer.toString());
        br.close();
    }

}
