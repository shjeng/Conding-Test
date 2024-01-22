package 배열.뒤집은_소수;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        for(int x : Main_A.solution(n,arr)){
            System.out.print(x + " ");
        }
    }

    public static ArrayList<Integer> solution(int n, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i=0;i<n;i++){
            int tmp = arr[i];
            int res = 0;
            while(tmp > 0){
                int t= tmp%10;
                res = res*10 + t;
                tmp = tmp/10;
            }
            if(isPrime(res)) answer.add(res);
        }
        return answer;
    }
    public static boolean isPrime(int num){
        if(num == 1) return false;
        for(int i=2;i<num;i++){
            if(num%i==0) return false;

        }
        return true;
    }
}
