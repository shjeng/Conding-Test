package bfs.동전교환;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    Queue<Integer> queue = new LinkedList<>();
    int m;
    int[] coins;

    int answer = 0;
    int nums[] = new int[10000];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main main = new Main();
        int n = scanner.nextInt();
        main.coins = new int[n];
        for (int i = 0; i < n; i++) {
            main.coins[i] = scanner.nextInt();
            main.queue.add(main.coins[i]);
        }
        main.m = scanner.nextInt();
        main.answer();
    }

    public void answer(){
        // m원을 어떻게 ?
        //
        int count = 0;
        while (answer == 0) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                Integer coin = queue.poll();
                if (coin == m) {
                    answer = count;
                    break;
                } else {
                    if (nums[coin] == 1) {
                        continue;
                    }
                    for (int j = 0; j < coins.length; j++) {
                        queue.add(coin + coins[j]);
                        nums[coin] = 1;
                    }
                }
            }
            count++;
        }
        // 하나씩 꺼내는 것마다 더해줌. 더한 게 m과 같으면 답이다.
        System.out.println(count);
    }

}
