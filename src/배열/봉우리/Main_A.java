package 배열.봉우리;

import java.util.Scanner;

public class Main_A {
    int[] dx = {-1,0,1,0}; // 방향
    int[] dy = {0,1,0,-1}; // 방향
    public static void main(String[] args) {
        Main_A T = new Main_A();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = scan.nextInt();
            }
        }
        System.out.println(T.solution(n,arr));
    }

    public int solution(int n, int[][] arr){
        int answer = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                boolean flag = true;
                for(int k=0;k<4;k++){
                    int nx = i+dx[k];
                    int ny = j+dy[k];
                    if(nx>=0 && nx<n && ny >= 0 && ny<n && arr[nx][ny] >= arr[i][j]) {
                        flag = false;
                        break;
                    }
                }
                if(flag) answer++;
            }
        }
        return answer;
    }
}
