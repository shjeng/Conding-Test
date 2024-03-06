package TwoPointers_Sliding_window.연속_부분수열;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        int[] nums = new int[N];

        int index1 = 0;
        int index2 = 1;
        int answer = 0;

        for (int i = 0; i < N; i++){
            nums[i] = scan.nextInt();
        }

        int sum = nums[index1] + nums[index2];
        while(index2<N-1){ // index2가 2일 때
            if(sum==M){ //
                answer++; // anser은 +1이 됨. 이 때 index2는 2
                sum -= nums[index1++];
                sum += nums[++index2]; // 인덱스 위치 옮겨줌. index2는 3이 됨.
                if(sum == M && index2 == N-1){
                    answer++;
                }
                continue;
            }
            if(sum<M){
                sum += nums[++index2];
                continue;
            }
            if(sum>M){
                sum -= nums[index1++];
                continue;
            }
        }
        System.out.println(answer);
    }
}
