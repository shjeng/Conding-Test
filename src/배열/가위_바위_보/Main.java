package 배열.가위_바위_보;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {  // 1>3>2
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int[] a = new int[num];
        for(int i=0;i<num;i++){
            a[i] = scan.nextInt();
        }
        for(int i=0;i<num;i++){
            int n = scan.nextInt();
            System.out.println(Main.solution(a[i],n));
        }
    }
    public static String solution(int a, int b){
        String answer = "";
        if(a==b) return "D";
        if(a==1 && b == 3) answer ="A";
        if(a==1 && b == 2) answer = "B";

        if(a==2 && b == 3) answer = "B";
        if(a==2 && b == 1) answer = "A";

        if(a==3 && b==1) answer = "B";
        if(a==3 && b==2) answer = "A";

        return answer;
    }
}
