package stack_queue.후위식_연산;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        Stack<Integer> integers = new Stack<>();

        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                integers.push(c - 48);
                continue;
            }
            int b = integers.pop();
            int a = integers.pop();
            switch (c){
                case ('+'): integers.push(a + b);
                    break;
                case ('-'): integers.push(a - b);
                    break;
                case ('*'): integers.push(a * b);
                    break;
                case ('/'): integers.push(a / b);
                    break;

            }
        }

        System.out.println(integers.pop());

    }
}
