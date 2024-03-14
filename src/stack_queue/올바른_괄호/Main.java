package stack_queue.올바른_괄호;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Stack<Character> stack = new Stack<>();
        String answer = "YES";

        try{
            for (char c : str.toCharArray()) {
                if(c == '('){
                    stack.push(c);
                } else{
                    stack.pop();
                }
            }
            if(stack.isEmpty()){
                System.out.println(answer);
            } else{
                System.out.println("NO");
            }
        } catch (Exception e){
            System.out.println("NO");
        }


    }
}
