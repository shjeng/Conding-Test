package 배열.소수_에라토스테네스_체;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println(Main.solution(num));
    }
    public static int solution(int num){
        int answer = 0;
        int[] nums = new int[num+1];
        // num이 만약 2라고 했을 경우 nums[2] 이런 식으로 사용할 것이기 때문에 new int[num+1]로 만들어줌.
        // new int[num]으로 만들 경우 num[2]는 오류가 발생함.
        for(int i=2;i<=num;i++){
            if(nums[i] == 0){ // 체크가 안 된 숫자는 소수라는 의미
                answer++;
                for(int j=i;j<=num;j=j+i){ // 만약 i가 숫자 2라면 2의 배수를 모두 체크해줌. 3이라면 3의 배수.
                    nums[j] = 1;
                }
            }
        }
        return answer;
    }
}
