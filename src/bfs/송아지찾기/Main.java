package bfs.송아지찾기;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 현수의 위치
        int m = scanner.nextInt(); // 송아지의 위치
        findCow(n, m, 0);
    }

    public static void findCow(int n, int m, int count) {
        if (n != m) {
            count++;
        }
        if (n == m) {
            System.out.println(count);
        } else if (n > m) {
            findCow(n - 1, m, count);
        } else if (n + 4 <= m) {
            findCow(n + 5, m, count);
        } else {
            findCow(n + 1, m, count);
        }
    }
}
