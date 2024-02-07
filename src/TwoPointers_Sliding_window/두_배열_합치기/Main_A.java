package TwoPointers_Sliding_window.두_배열_합치기;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = scan.nextInt();
        }
        int m = scan.nextInt();
        int[] b = new int[m];
        for(int i=0;i<m;i++){
            b[i] = scan.nextInt();
        }
        for(int x : Main_A.solution(n,m,a,b)) System.out.print(x + " ");
    }

    private static ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0, p2=0;
        while(p1<n && p2<m){
            if(a[p1]<b[p2]) answer.add(a[p1++]);
            else answer.add(b[p2++]);
        }
        while (p1<n) answer.add(a[p1++]);
        while (p2<m) answer.add(b[p2++]);
        return answer;
    }
}
