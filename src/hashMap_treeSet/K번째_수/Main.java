package hashMap_treeSet.K번째_수;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), k = scanner.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        TreeSet<Integer> set = new TreeSet<>(Comparator.reverseOrder());
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int l = j + 1; l < n; l++) {
                    int sum = nums[i] + nums[j] + nums[l];
                    set.add(sum);
                }
            }
        }

        Iterator<Integer> iterator = set.iterator();
        int answer = -1;
        while (k > 0) {
            if (iterator.hasNext()) {
                answer = iterator.next();
            } else {
                answer = -1;
            }
            k--;
        }
        System.out.println(answer);

    }
}
