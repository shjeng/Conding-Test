package TwoPointers_Sliding_window.두_배열_합치기;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder sbu = new StringBuilder();
        int n = scan.nextInt();
        int[] nums1 = new int[n];
        for(int i=0;i<n;i++){
           nums1[i] = scan.nextInt();
        }
        int m = scan.nextInt();
        int[] nums2 = new int[m];
        for(int i=0;i<m;i++){
            nums2[i] = scan.nextInt();
        }
        int o = 0; // 첫 번째 배열의 인덱스
        int t = 0; // 두 번째 배열의 인덱스

        boolean oo = false;
        boolean tt = false;

        for(int i=0;i<n+m;i++){
            if(o<n && nums1[o] < nums2[t]){ // 배열1의 o번째 숫자가 배열 2의 t번째 숫자보다 작을 때
                sbu.append(nums1[o] + " "); // 작은 숫자를 stringbuilder에 추가
                if(o == n-1) { // 첫 번째 배열의 마지막 숫자까지 stringBuilder에 추가했으면 MAX_VALUE로 최대값 주기
                    nums1[n-1] = Integer.MAX_VALUE;
                    oo = true;
                }
                if(o<n-1) o++;
                continue; // 처음에 continue를 안 써서 틀림. continue를 안 쓰면 아래 if문에서 nums1[o++]인 상태로 비교하는 것
            }
            if(t<m && nums1[o] >= nums2[t]){
                sbu.append(nums2[t] + " ");
                if(t == m-1) {
                    nums2[m-1] = Integer.MAX_VALUE;
                    tt= true;
                }
                if(t<m-1) t++;
            }
            if(oo && tt) break;
        }
        System.out.println(sbu.toString());
    }
}
