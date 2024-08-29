import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    int[] x = {-1, 0, 1, 0};
    int[] y = {0, -1, 0, 1};
    int[][] map;
    int answer = 0;
    int width;
    int height;
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        Main main = new Main();

        String readLine = bufferedReader.readLine();
        int T = Integer.parseInt(readLine);
        for (int ii = 0; ii < T; ii++) {
            StringTokenizer sto = new StringTokenizer(bufferedReader.readLine());
            main.height = Integer.parseInt(sto.nextToken());
            main.width = Integer.parseInt(sto.nextToken());
            main.map = new int[main.height][main.width];
            int c = Integer.parseInt(sto.nextToken());
            for (int i = 0; i < c; i++) {
                sto = new StringTokenizer(bufferedReader.readLine());
                main.map[Integer.parseInt(sto.nextToken())][Integer.parseInt(sto.nextToken())] = 1;
            }
            for (int i = 0; i < main.height; i++) {
                for (int j = 0; j < main.width; j++) {
                    if (main.map[i][j] == 0) {
                        continue;
                    }
                    main.answer(i, j);
                    main.answer++;
                }
            }
            System.out.println(main.answer);
            main.answer = 0;
        }
    }

    public void answer(int n, int m) {
        if (n < 0 || m < 0 || n >= height || m >= width) {
            return;
        }
        if (map[n][m] != 0) {
            map[n][m] = 0;
            for (int i = 0; i < 4; i++) {
                int tempX = m + x[i];
                int tempY = n + y[i];
                answer(tempY, tempX);
            }
        }
//            https://www.acmicpc.net/problem/1012
    }
}