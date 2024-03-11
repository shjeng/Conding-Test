package hashMap_treeSet.매출액의_종류;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Answer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Answer.solution(n, k, arr);

    }
    public static void solution(int n, int k, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < k - 1; i++) {
            hashMap.put(arr[i], hashMap.getOrDefault(arr[i], 0) + 1); // hashMap.getOrDefault(arr[i],0) : 키 값이 있으면 값을 반환하고, 없으면 0을 반환
        }
        int lt = 0;
        for (int rt = k - 1; rt < n; rt++) {
            hashMap.put(arr[rt],hashMap.getOrDefault(arr[rt],0)+1);
            answer.add(hashMap.size());
            hashMap.put(arr[lt],hashMap.get(arr[lt])-1);
            if(hashMap.get(arr[lt])==0) hashMap.remove(arr[lt]);
            lt++;
        }
        for (Integer i : answer) {
            System.out.print(i + " ");
        }

    }
}
