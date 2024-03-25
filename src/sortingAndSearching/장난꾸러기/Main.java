package sortingAndSearching.장난꾸러기;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        int[] nums2 = new int[n];
        for (int i = 0; i < n; i++) {
            int k = scanner.nextInt();
            nums[i] = k;
            nums2[i] = k;
        }
        Arrays.sort(nums2);

        int index = 0;
        for (int i = 0; i < n; i++) {
            if(nums[i] != nums2[i]){
                System.out.print(i+1 + " ");
            }
        }

    }
}
