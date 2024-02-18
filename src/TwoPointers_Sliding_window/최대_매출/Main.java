package TwoPointers_Sliding_window.최대_매출;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), k = scan.nextInt(); // N일, 연속된 K일
        int[] nums = new int[n]; // 매출기록
        for(int i=0;i<n;i++){
            nums[i] = scan.nextInt();
        }

        System.out.println(Main.solution(n,nums, k));
    }
    public static int solution(int n, int[] nums, int k){
        int answer = 0;
        int sum = 0;
        for(int i=0;i<k;i++){
            answer += nums[i];
        }
        sum = answer;
        for(int i=0;i<n-k;i++){ // n이 10일 때 k는 3. 즉 i의 최대 값은 6, 배열은 0~9까지 존재함
            sum -= nums[i]; //
            sum += nums[k+i]; // 연속되는 숫자의 마지막 숫자의 인덱스
            if(sum>answer) answer=sum;
        }
        return answer;
    }
}
