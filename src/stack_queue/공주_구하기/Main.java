package stack_queue.공주_구하기;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < n; i++) {
            queue.add(i+1);
        }
        while(queue.size() != 1) {
            for(int i=0;i<k;i++){
                if(i == k-1) {
                    queue.poll();
                    break;
                }
                queue.add(queue.poll());
            }

        }
        System.out.println(queue.poll());
    }
}
