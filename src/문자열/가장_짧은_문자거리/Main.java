package 문자열.가장_짧은_문자거리;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        String str1 = scanner.next();
        char c = scanner.next().charAt(0);
        System.out.println(Main.solution(str1,c));
    }
    public static String solution(String str, char c){
        StringBuilder stringBuilder = new StringBuilder();

        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == c) count++;
        }

        int[] nums = new int[count];
        int index = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == c) {
                nums[index] = str.indexOf(c,i);
                index++;
            }
        }

        for(int i=0;i<str.length();i++){
            int tt = 10000;
            int cs = str.indexOf(str.charAt(i),i);
            if(str.charAt(i) == c){
                stringBuilder.append(0 + " ");
                continue;
            }
            for(int j=0;j< nums.length;j++){
                int num = 0;
                if(cs>nums[j]){
                    num = cs - nums[j];
                } else{ // cs<nums[j]
                    num = nums[j] - cs ;
                }
                tt = Math.min(tt,num);
            }
            stringBuilder.append(tt).append(" ");
        }

        return stringBuilder.toString();
    }
}
