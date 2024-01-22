package 배열.큰_수_출력하기;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int nums[] = new int[num];
        for(int i=0;i<num;i++){
            nums[i] = scanner.nextInt();
        }
        Main.solution(nums);
    }
    public static void solution(int[] nums){
        System.out.print(nums[0] + " ");
        for(int i=1;i<nums.length;i++){
            if(nums[i] > nums[i-1]) System.out.print(nums[i] + " ");
        }
    }
}
