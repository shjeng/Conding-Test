package stack_queue;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int board[][] = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                board[i][j] = scanner.nextInt();
            }
        }

        int move = scanner.nextInt();
        int moves[] = new int[move];
        for(int i = 0; i < move; i++){
            moves[i] = scanner.nextInt();
        }
        Stack<Integer> stack = new Stack<>();


        // x 고정, y 내려가야됨.
        int answer = 0;
        for(int i = 0; i < move; i++){
            int x = moves[i]-1;
            for(int j = 0; j < n; j++){
                if(board[j][x] != 0){
                    stack.add(board[j][x]);
                    board[j][x] = 0;
                    break;
                }
            }
            if(!stack.isEmpty()){
                int temp = stack.pop();
                if(!stack.isEmpty()&&temp == stack.peek()){
                    stack.pop();
                    answer+=2;
                    continue;
                }
                stack.add(temp);
            }

        }


        System.out.println(answer);
    }
}
