package dfs.합이_같은_부분집합;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    int n;
    int nums[];
    int total = 0;
    String answer = "NO";
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        main.n = n;
        main.nums = new int[n];
        for (int i = 0; i < n; i++) {
            main.nums[i] = scanner.nextInt();
            main.total += main.nums[i];
       }
        // 0부터 5까지를 넣어주어야함.
        main.dfs(0,0);
        System.out.println(main.answer);

    }

    public void dfs(int n, int sum){
        if (n == nums.length) {
            if (sum == (total - sum)) {
                answer = "YES";
            }
        } else {
            if (answer.equals("YES")) {
                return;
            }
            this.dfs(n + 1,sum + nums[n]);
            this.dfs(n + 1, sum);
        }
    }

}
