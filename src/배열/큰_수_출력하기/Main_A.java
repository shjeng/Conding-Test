package 배열.큰_수_출력하기;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        for(int x: Main_A.solution(n, arr)){
            System.out.print(x + " ");
        }
    }

    public static ArrayList<Integer> solution(int n, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for(int i=1; i<n; i++){
            if(arr[i] > arr[i-1]) answer.add(arr[i]);
        }
        return answer;
    }
}
