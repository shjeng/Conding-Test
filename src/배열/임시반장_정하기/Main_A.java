package 배열.임시반장_정하기;

import java.util.Scanner;

public class Main_A {
    public static void main(String[] args) {
        Main_A T = new Main_A();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); // 학생 수
        int[][] arr = new int[n+1][6]; // n으로 해도 되지만 가독성이 좋게 하기 위해서 n+1과 6 배열
        for(int i=0;i<=n;i++){
            for(int j=1;j<=5;j++){
                arr[i][j] = scan.nextInt();
            }
        }
        System.out.println(T.solution(n,arr));
    }

    public int solution(int n, int[][] arr){
        int answer = 0, max = Integer.MIN_VALUE;
        for(int i=1;i<=n;i++){
            int cnt = 0;
            for(int j=1; j<=n; j++){
               for(int k=1;k<=5;k++){
                   if(arr[i][k] == arr[j][k]){
                       cnt++;
                       break;
                   }
               }
            }
        if(cnt>max){
            max = cnt;
            answer = i;
        }
        }
        return answer;
    }
}
