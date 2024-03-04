package TwoPointers_Sliding_window.연속_부분수열;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt(), M = scan.nextInt();

        int result = 0;

        int nums[] = new int[N];
        for(int i=0;i<N;i++){
            nums[i] = scan.nextInt();
            if(nums[i] == M) result++;

        }
        int start = 0, end =1, sum = nums[start] + nums[end];

        while(end < N-1){
            if(sum == M){
                sum -= nums[start];
                start ++; end++;
                sum += nums[end];
                result++;
                continue;
            }
            if(sum>M){
                sum -= nums[start];
                start++;
                continue;
            }
            end++;
            sum += nums[end];
        }
        System.out.println(result);
    }
}
