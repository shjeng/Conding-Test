package 배열.멘토링;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); // 학생 수
        int m = scan.nextInt(); // 시험 수
        int students[][] = new int[m][n]; // n명의 학생과 m번의 시험
        int answer = 0;
        int[][] chk =  new int[n][n]; // 학생 번호가 3이면 chk[n-1]

        for(int i=0;i<m;i++){ // 시험
            for(int j=0;j<n;j++){ // 학생
                students[i][j] = scan.nextInt();
            }
        }

        //4 3
        //3 4 1 2
        //4 3 2 1
        //3 1 4 2
        //순으로 입력했을 경우에

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){ // 처음엔 1등
                int mento = students[i][j]; // 첫 시험 1등은 3임
                for(int k=j+1;k<n;k++){ // 2등은 1등 멘토를 절대 못해줌.
                    int menti = students[i][k]; // 첫k는 2등을 의미함. 첫 시험의 2등은 4임
                    chk[menti-1][mento-1] = -1; // 4번 학생은 3번 학생 멘토가 안됨.
                }
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(chk[i][j] == 0 && i!=j) answer += 1;
            }
        }
        System.out.println(answer);
    }
}
