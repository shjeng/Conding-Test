package dfs.바둑이_승차;

import java.util.Scanner;

public class Main {

    public int[] nums;
    public int n;
    int answer = 0;
    int max;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Main main = new Main();
        main.max = scanner.nextInt();
        main.n = scanner.nextInt();
        main.nums = new int[main.n];

        for (int i = 0; i < main.n; i++) {
            main.nums[i] = scanner.nextInt();
        }
        int sum = 0;
        main.dfs(0, sum);
        System.out.println(main.answer);
    }

    public void dfs(int index, int sum) {
        if (index == n) {
            if (max >= sum && sum > answer) {
                answer = sum;
            }
        } else {
            dfs(index + 1, nums[index] + sum);
            dfs(index + 1, sum);
        }
    }
}
