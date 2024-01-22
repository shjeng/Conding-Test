package 배열.소수_에라토스테네스_체;

import java.util.Scanner;

public class Main_A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(Main_A.solution(n));
    }

    public static int solution(int n){
        int answer = 0;
        int[] ch = new int[n+1]; // index 번호가 n번까지 있어야하니깐 n+1 배열을 만들어줌.
        for(int i=2;i<=n; i++){
            if(ch[i] == 0){
                answer++;
                for(int j=i;j<=n;j=j+i){ // i의 배수여야 하니깐 j=i로 시작, j=j+i 조건으로 반복
                    ch[j]=1;
                }// 두 번째 for문
            } // if문
        } // 첫 번째 for문
        return answer;
    }
}
