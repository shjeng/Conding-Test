package dfs.최대점수구하기;

import java.util.Scanner;

public class Main {

    int[] q;
    int[] times;
    int n;
    int m;
    int answer;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main main = new Main();
        main.n = scanner.nextInt(); // N개의 문제
        main.m = scanner.nextInt(); // 최대 시간
        main.q = new int[main.n + 1];
        main.times = new int[main.n + 1];
        for (int i = 1; i < main.n+1; i++) {
            main.q[i] = scanner.nextInt();
            main.times[i] = scanner.nextInt();
        }

        System.out.println(main.dfs(1, 0, 0));

    }


    private int dfs(int index, int score, int time) {
        if (time > m) {
            return 0;
        }
        if (index == n+1) {
            if (answer < score) {
                answer = score;
                return score;
            }
            return 0;
        } else {
            return Math.max(dfs(index + 1, score + q[index], time + times[index]),dfs(index + 1, score, time));
        }
    }
}
