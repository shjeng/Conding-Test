package 배열.점수계산;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        Main.solution(num,scan);
    }
    public static void solution(int num,Scanner scanner){
        int answer = 0;
        int plus = 0;
        for(int i=0;i<num;i++){
            String s = scanner.next();
            if(s.equals("1")){
                answer += plus + 1;
                plus++;
            } else{
                plus = 0;
            }
        }
        System.out.println(answer);
    }
}
