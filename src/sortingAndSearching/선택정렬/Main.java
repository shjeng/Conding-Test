package sortingAndSearching.선택정렬;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i1 = scanner.nextInt();
        int[] nums = new int[i1];
        for (int i = 0; i < i1; i++) {
            nums[i] = scanner.nextInt();
        }
        Arrays.sort(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }

    }
}
