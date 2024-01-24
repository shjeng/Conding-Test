package 배열.멘토링;

import java.util.Scanner;

public class Main_A {
    public static void main(String[] args) {
        Main_A T = new Main_A();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[][] arr = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = scan.nextInt();
            }
        }
        System.out.println(T.solution(n,m,arr));
    }

    public static int solution(int n, int m, int[][] arr){
        int answer = 0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                int cnt = 0;
                for(int k=0;k<m;k++){ // 시험 횟수
                    int pi=0, pj=0;
                    for(int s=0;s<n;s++){ // 학생 수 만큼 반복
                        if(arr[k][s]==i) pi=s; // i번 학생과 j번 학생을 비교함
                        if(arr[k][s]==j) pj=s;
                    }
                    if(pi<pj) cnt++;
                }
                if(cnt == m){
                    answer++;
                }
            }
        }
        return answer;
    }
}
