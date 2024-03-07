package hashMap_treeSet.학급_회장_hash;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        String str = scan.next();

        int[] count = new int[5];
        for (int i = 0; i < N; i++) {
            count[str.charAt(i) - 65] += 1;
        }

        int index = 0;
        int max = 0;
        for (int i = 0; i < 5; i++) {
            if (count[i] > max) {
                max = count[i];
                index = i;
            }
        }
        System.out.println(Character.toChars(index+65));
    }
}
