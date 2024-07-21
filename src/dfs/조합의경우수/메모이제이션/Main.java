package dfs.조합의경우수.메모이제이션;

import java.util.Scanner;

public class Main {
    int[][] dy = new int[35][35];

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int r = scanner.nextInt();
        System.out.println(main.BFS(n, r))
        ;
        scanner.close();
    }

    public Integer BFS(int n, int r) {
        if (dy[n][r] > 0) {
            return dy[n][r];
        }
        if (n == r || r == 0) {
            return 1;
        } else {
            return dy[n][r] = BFS(n - 1, r - 1) + BFS(n - 1, r);
        }

    }
}
