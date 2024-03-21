package stack_queue.응급실;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), m = scanner.nextInt(), max = 0;

        int index = m+1; // 현재 위치, 0으로 시작하니 1을 더해주었음.

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            int i1 = scanner.nextInt();
            queue.add(i1);
            if(max<=i1) max = i1;
        }

        int answer = 0;
        while(true){
            int i = queue.poll();
            if(i == max && index == 1){
                answer++;
                break;
            }
            if(i == max){
                answer++;
                max = 0;
                Iterator<Integer> iterator1 = queue.iterator();
                while(iterator1.hasNext()){
                    Integer next = iterator1.next();
                    if(max<=next) max = next;
                }
            } else{
                queue.add(i);

            }
            index--;
            if(index == 0) index = queue.size();
        }
        System.out.println(answer);
    }
}

//Exception in thread "main" java.util.ConcurrentModificationException 정리하기