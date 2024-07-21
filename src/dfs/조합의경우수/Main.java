package dfs.조합의경우수;

import java.util.Scanner;

public class Main {
    int answer = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main main = new Main();
        int n = scanner.nextInt();
        int r = scanner.nextInt();
        main.answer(n, r);

        System.out.println(main.answer);
    }

    public void answer(int n, int r){
        if (n == r || r == 0) {
            answer++;
        } else {
            answer(n-1, r-1);
            answer(n - 1, r);
        }

    }
}
