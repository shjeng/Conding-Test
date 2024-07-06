package sortingAndSearching.마구간정하기;

import java.util.Scanner;

import static java.util.Arrays.sort;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = scanner.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int answer = 0;
        sort(nums);

        int lt = 1;
        int rt = nums[n - 1];
        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (count(nums, mid) >= c) {
                answer = mid;
                lt = mid + 1;
            } else {
                rt = mid - 1;
            }
        }

    }

    public static int count(int[] nums, int capacity) {
        int cnt = 1;
        int ep = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - ep >= capacity) {
                cnt++;
                ep = nums[i];
            }
        }
        return cnt;
    }
}
// 1  2 3 4 5  6  7 8 9 10 11    12
//