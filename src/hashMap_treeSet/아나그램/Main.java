package hashMap_treeSet.아나그램;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        String str2 = scanner.next();
        int[] nums1 = new int[58];
        int[] nums2 = new int[58]; // A-65 = 0
        for (int i = 0; i < str1.length(); i++) {
            nums1[str1.charAt(i) - 65]++;
            nums2[str2.charAt(i) - 65]++;
        }
        String answer = "YES";
        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] != nums2[i]) {
                answer = "NO";
                break;
            }
        }
        System.out.println(answer);
    }
}
