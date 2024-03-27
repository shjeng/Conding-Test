package hashMap_treeSet.이분검색;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int nums[] = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        Arrays.sort(nums);
        int answer = 0;
        int min = 0;
        int max = n - 1;
        while(min<=max){
            // 가운대부터 시작을 합니다.
            int middle = (max + min) / 2;
            if(nums[middle] > k){
                max = middle -1;
            } else if (nums[middle] < k){
                min = middle + 1;
            } else if (nums[middle] == k) {
                answer = middle+1;
                break;
            }
        }
        System.out.println(answer);
    }
}
