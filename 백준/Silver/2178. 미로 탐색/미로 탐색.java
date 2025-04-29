import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    private static int[][] dfs;
    private static int N;
    private static int M;

    private static int[] xCoordinates = {-1, 0, 1, 0};
    private static int[] yCoordinates = {0, -1, 0, 1};


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] nmStr = bufferedReader.readLine().split(" ");
        N = Integer.parseInt(nmStr[0]);
        M = Integer.parseInt(nmStr[1]);
        dfs = new int[N + 1][M + 1];


        for (int i = 1; i < N + 1; i++) {
            String nums = bufferedReader.readLine();
            for (int j = 0; j < M; j++) {
                dfs[i][j + 1] = nums.charAt(j) - '0';
            }
        }

        int[] index = new int[]{1, 1};
        Queue<int[]> queue = new LinkedList<>();
        queue.add(index);
        while (!queue.isEmpty()) {
            int[] nowIndex = queue.poll();
            int x = nowIndex[0];
            int y = nowIndex[1];
            if (x == M && y == N) {
                break;
            }
            for (int i = 0; i < 4; i++) {
                int currentX = x +xCoordinates[i];
                int currentY = y + yCoordinates[i];
                if (currentX <= M && currentY <= N && dfs[currentY][currentX] == 1) {
                    dfs[currentY][currentX] = dfs[y][x] + 1;
                    queue.add(new int[]{currentX, currentY});
                }
            }
        }
        System.out.println(dfs[N][M]);
    }
}

