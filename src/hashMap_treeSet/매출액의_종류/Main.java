package hashMap_treeSet.매출액의_종류;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(), K = scanner.nextInt();
        int nums[] = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = scanner.nextInt();
        }

        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < K; i++) {
            map.put(nums[i],1);
        }


    }
}
