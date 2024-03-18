package stack_queue.쇠막대기;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        Stack<Character> stack = new Stack<>();

        int stick = 0, answer = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c==')' && str.charAt(i-1)=='(') {
                stick--;
                answer--;
                stack.pop();
                answer+=stick;
                continue;
            }
            if (c==')' && str.charAt(i-1)!='(') {
                stick--;
                stack.pop();
                continue;
            }
            if(c=='('){
                stick++;
                answer++;
            }
            stack.push(c);
        }
        System.out.println(answer);
    }
}
