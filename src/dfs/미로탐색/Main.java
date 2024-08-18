package dfs.미로탐색;

import java.util.Scanner;

public class Main {

    int[][] nums = new int[8][8];
    final int[] xCoordinates = {-1,0,1,0};
    final int[] yCoordinates = {0, -1, 0, 1};

    int answer = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main main = new Main();

        for (int i = 1; i < 8; i++) {
            for (int j = 1; j < 8; j++) {
                main.nums[i][j] = scanner.nextInt();
            }
        }
        main.DFS(1, 1);
        System.out.println(main.answer);
    }

    private void DFS(int x, int y) {
        if (x == 0 || y == 0 || x>7 || y > 7 || nums[y][x] == 1) {
            return;
        }
        if (x == 7 && y == 7) {
            answer++;
        } else {
            for (int i = 0; i < 4; i++) {
                int xCoordinate = xCoordinates[i];
                int yCoordinate = yCoordinates[i];
                nums[y][x] = 1;
                DFS(x + xCoordinate, y + yCoordinate);
                nums[y][x] = 0;
            }
        }
    }
}
