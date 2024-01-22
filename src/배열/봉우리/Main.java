package 배열.봉우리;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[][] nums = new int[num+2][num+2];
        int answer = 0;
        // 가장자리는 0으로 초기화돼있어야함. 5X5면 0을 포함한 총 배열은 7X7
        for(int i=1;i<=num;i++){ // num이 5라는 가정하에 1 2 3 4 5
            for(int j=1;j<=num;j++){
                nums[i][j] = scanner.nextInt();
            }
        }
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                // 뒤                      / 앞                       // 위                       // 아래
                if(nums[i][j]>nums[i-1][j]&&nums[i][j]>nums[i+1][j] && nums[i][j] > nums[i][j-1]&&nums[i][j]>nums[i][j+1] ){
                    answer++;
                };
            }
        }
        System.out.println(answer);
    }
}
