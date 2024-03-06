package TwoPointers_Sliding_window.최대_길이_연속부분수열;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt(), k = scan.nextInt();
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = scan.nextInt();
        }
        int count = 0, answer = 0, k2 = k;
        for (int i = 0; i < N; i++) {
            k2=k;
            count = 0;
            for (int j = i; j < N; j++) {
                if (nums[j] == 0 ) {
                    k2--;
                    if(k2>=0) count++; // k가 0 이상일 때만 카운트를 해줌.
                    if(k2<0) break;
                } else {
                    count++;
                }
            }
            if(count > answer){
                answer = count;
            }
        }
        System.out.println(answer);
    }
}
