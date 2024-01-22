package 배열.피보나치_수열;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num  = scan.nextInt();
        int f = 0;
        int s = 1;
        System.out.print(s + " ");
        for(int i=1;i<num;i++){
            int sum = f + s;
            f = s;
            s = sum;
            System.out.print(sum + " ");
        }
    }
}
