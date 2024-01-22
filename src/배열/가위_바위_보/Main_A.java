package 배열.가위_바위_보;

import java.util.Scanner;

public class Main_A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i=0; i<n; i++){
            a[i] = scan.nextInt();
        }
        for(int i=0; i<n; i++){
            b[i] = scan.nextInt();
        }
        System.out.println(Main_A.solution(n,a,b));
    }

    private static String solution(int n, int[] a, int[] b) {
        String answer = "";
        for(int i=0; i<n; i++){
            if(a[i] == b[i]) answer += "D\n";
            else if (a[i]==1 && b[i]==3)answer +="A\n";
            else if (a[i]==2 && b[i]==1)answer +="A\n";
            else if (a[i]==3 && b[i]==2)answer +="A\n";
            else answer += "B\n";
        }
        return answer;
    }
}
