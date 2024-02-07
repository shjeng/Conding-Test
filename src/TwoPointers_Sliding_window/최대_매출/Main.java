package TwoPointers_Sliding_window.최대_매출;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), k = scan.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = scan.nextInt();
        }
        if(n%2 == 0){
            n = n/2;
        } else{
            n = n/2 + 1;
        }

        System.out.println(Main.solution(n,nums, k));
    }
    public static int solution(int n, int[] nums, int k){
        int answer = 0;
        int a = k%2 == 0 ? k/2 : k/2+1;
        int start = 0;
        int last = nums.length-k;

        int sum1 =0, sum2 = 0;
        for(int i=0;i<k;i++){
//            sum1 +=
        }

        return answer;
    }
}
