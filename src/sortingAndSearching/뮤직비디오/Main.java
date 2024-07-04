package sortingAndSearching.뮤직비디오;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int lt = Arrays.stream(nums).max().getAsInt();
        int rt = Arrays.stream(nums).sum();

        int answer = rt;



        while (lt <= rt){
            int mid = (lt + rt) / 2;
            if(count(nums, mid) <= m) {
                answer = mid;
                rt = mid - 1;
            } else {
                lt = mid + 1;
            }
        }

        System.out.println(answer);
    }
    public static int count(int[] arr, int capacity){
        int cnt = 1, sum = 0;
        for (int x : arr) {
            if(sum + x > capacity){
                cnt++;
                sum = x;
            } else {
                sum += x;
            }
        }
        return cnt;
    }
}
