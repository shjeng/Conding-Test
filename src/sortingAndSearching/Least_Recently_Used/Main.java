package sortingAndSearching.Least_Recently_Used;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Main.fail(scanner);  // 실패한 답
        Main.success(scanner);
        scanner.close();
    }

    private static void success(Scanner scanner) {
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < k; i++) {
            int t = scanner.nextInt();
            if(queue.contains(t)){ // 만약 입력 받은 값이 이미 존재한다면
                int size = queue.size();
                while(size>0){ // 젤 먼저 나오는게 젤 뒤에 넣어야함. 값을 다 빼주어야함.
                    int q = queue.poll();
                    if(q != t) queue.add(q);
                    if(size==1) queue.add(t);
                    size--;
                }
                continue;
            }
            queue.add(t);
            if(queue.size() > n){
                queue.remove();
            }
        }
        Stack<Integer> stack = new Stack<>();
        for (Integer i : queue) {
            stack.push(i);
        }
        for (int i = 0; i < n; i++) {
            System.out.print(stack.pop() + " ");
        }
    }

    public static void fail(Scanner scanner){
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < k; i++) {
            queue.add(scanner.nextInt());
            if(queue.size() > n){
                queue.remove();
            }
        }
        Stack<Integer> stack = new Stack<>();
        for (Integer i : queue) {
            stack.push(i);
        }
        System.out.println(stack);
        for (int i = 0; i < n; i++) {
            System.out.print(stack.pop() + " ");
        }

        // 10 50
        // 24 7 50 3 1 11 26 1 27 44 16 21 4 36 37 43 49 9 28 5 10 34 36 32 3 17 40 21 5 22 48 46 27 2 30 14 41 45 35 41 16 33 36 7 19 36 45 26 9 14
        // Cache Hit를 빠트림.
    }
}
