package TwoPointers_Sliding_window.공통원소_구하기;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder(); // 결과를 담아줌
        int n = scan.nextInt(); //
        int ns[] = new int[n];
        for(int i=0;i<n;i++){
            ns[i] = scan.nextInt();
            if(i == n-1) Arrays.sort(ns); // 첫 번째 배열 오름차순으로
        }
        int m = scan.nextInt();
        int ms[] = new int[m];
        for(int i=0;i<m;i++){
            ms[i] = scan.nextInt();
            if(i == m-1) Arrays.sort(ms); // 두 번째 배열 오름차순으로, Arrays.sort(int[], Collections.reverseOrder()) -> 내림차순
        }

        int index1 = 0;
        int index2 = 0;

        for(int i=0;i<n+m;i++){
            if(index1==n && index2 == m) break;
            if(index1>=n) index1=n-1;
            if(index2>=m) index2=m-1;
            if(ns[index1] == ms[index2]){
                stringBuilder.append(ns[index1] + " ");
                index1++;
                index2++;
                continue;
            }
            if(ns[index1]>ms[index2]){ // 첫 번째 배열의 숫자가 크면 첫 번째 배열의 index를 올린다
                index2++;
            } else{  // 두 번째 배열의 숫자가 크면 첫 번째 배열의 index를 올린다
                index1++;
            }
        }
        System.out.println(stringBuilder.toString());
    }
}
