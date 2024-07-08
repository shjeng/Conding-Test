package bfs;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int count = 0;
        while(n != m) {
            if (n > m) {
                n -= 1;
                count++;
            } else if (n + 5 < m || n+4<=m) {
                count++;
                n+=5; // 한번에 앞으로 5칸 이동
            } else {
                count++;
                n+=1;
            }
        }
        System.out.println(count);
        scanner.close();

    }
}
