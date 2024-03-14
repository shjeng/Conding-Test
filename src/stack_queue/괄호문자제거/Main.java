package stack_queue.괄호문자제거;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            if(c=='('){
                stack.add(c);
            }
            if(c==')'){
                stack.pop();
                continue;
            }
            if(stack.isEmpty()){
                System.out.print(c);
            }

        }



    }

}
