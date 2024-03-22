package sortingAndSearching.버블정렬;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 정렬하는 방법은 버블정렬.
        Scanner scanner = new Scanner(System.in);
        int i1 = scanner.nextInt(); // 배열의 크기
        int[] nums = new int[i1]; // 배열
        for (int i = 0; i < i1; i++) {
            nums[i] = scanner.nextInt();
        }

        for (int i = 0; i<i1; i++) {
            for(int j=i+1;j<i1;j++){
                if(nums[i]>nums[j]){
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
        }

        for (int num : nums) {
            System.out.print(num + " ");
        }


    }
}
