package 배열.임시반장_정하기;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int[][] students = new int[num][num]; // 같은 반 쳌느 배열
        int max = 0;
        int answer = 0;
        int[][] score = new int[num][5]; // 1반부터 5반까지의 점수들

        for(int i=0;i<num;i++){
            for(int j=0;j<5;j++){
                score[i][j] = scan.nextInt();
            }
        }
        for(int k=0;k<5;k++){
            for(int i=0;i<num;i++){
                int student = score[i][k]; // i는 학생 번호
                for(int j=i+1;j<num;j++){ // 다음 학생 번호
                    if(students[i][j] == 1) continue;
                    int nextStu = score[j][k];
                    if(student == nextStu){
                        students[i][j] = 1; // i학생과 j학생의 반이 같을 때
                        students[j][i] = 1;
                    }
                }
            }
        }
        for(int i=0;i<num;i++){
            int sum = Arrays.stream(students[i]).sum();
            if(sum>max) {
                max = sum;
                answer = i+1;
            }
        }
        System.out.println(answer);
    }
}
