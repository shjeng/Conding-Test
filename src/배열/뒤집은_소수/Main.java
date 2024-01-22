package 배열.뒤집은_소수;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder stringBuilder;
        int num = scan.nextInt();
        int[] nums = new int[num];
        for (int i=0;i<num;i++){
            String a = scan.next();
            stringBuilder = new StringBuilder(a).reverse(); //
            nums[i] = Integer.parseInt(stringBuilder.toString()); // 뒤집은 숫자 int로 변환
        }
        Main.solution(nums);

    }

    public static void solution(int[] nums){

        for (int num : nums) {
            int count = 0;
            for(int i=2;i<num;i++){
                if(num%i == 0) count++;
                if(count>0) break;
            }
            if(count>0) count = 0;
            else if(num >1 )System.out.print(num + " ");
        }

    }
}
