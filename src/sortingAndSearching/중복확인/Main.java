package sortingAndSearching.중복확인;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Stack<Integer> stack = new Stack<>();
        String answer = "U";
        for (int i = 0; i < n; i++) {
            int k = scanner.nextInt();
            if(stack.contains(k)){
                answer = "D";
                break;
            }
            stack.add(k);
        }
        System.out.println(answer);
    }
}
