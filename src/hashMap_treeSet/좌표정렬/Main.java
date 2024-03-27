package hashMap_treeSet.좌표정렬;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] nums = new int[n][2];
        for(int i = 0;i<n;i++){
            int x = scanner.nextInt();
            nums[i][0] = x;
            nums[i][1] = x * 100000 + scanner.nextInt();
        }
        Arrays.sort(nums, Comparator.comparingInt(a -> a[1]));
//        Arrays.sort(nums,(a,b)->Integer.compare(a[1],b[1])); // 배열의 1번째 숫자를 가지고 비교하는 방법.

        for(int i = 0;i<n;i++){
            System.out.println(nums[i][0] + " " + (nums[i][1] - nums[i][0] * 100000));
        }


    }
}
