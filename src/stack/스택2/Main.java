package stack.스택2;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < N; i++) {
            String str = scanner.nextLine();
            String[] strs = str.split(" ");
            int firstNum = Integer.parseInt(strs[0]);
            if (firstNum == 1) {
                stack.add(Integer.parseInt(strs[1]));
            }
            if (firstNum == 2) {
                if (stack.empty()) {
                    result.append("-1\n");
                } else {
                    result.append(stack.pop()).append("\n");
                }
            } else if (firstNum == 3) {
                result.append(stack.size()).append("\n");
            } else if (firstNum == 4) {
                if (stack.empty()) {
                    result.append("1\n");
                } else {
                    result.append("0\n");
                }
            } else if (firstNum == 5) {
                if (stack.empty()) {
                    result.append("-1\n");
                } else {
                    result.append(stack.peek()).append("\n");
                }
            }
        }

        System.out.println(result.toString());
    }

}
