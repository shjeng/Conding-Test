package bfs.송아지찾기;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main2 {
    int answer = 0;
    int[] dis = {1, -1, 5};
    int[] ch;
    Queue<Integer> Q = new LinkedList<>();

    public int BFS(int s, int e) {
        ch = new int[10001];
        ch[s] = 1; // 현재 위치를 시작하자마자 배열에 넣어줌
        Q.offer(s); //
        int L = 0; // 콩콩이를 탄 횟수
        while (!Q.isEmpty()) {
            int len = Q.size();
            for (int i = 0; i < len; i++) {
                int x = Q.poll();
                for (int j = 0; j < 3; j++) {
                    int nx = x+dis[j];
                    if (x == e) return L;
                    if (nx >= 1 && nx <= 10000 && ch[nx] == 0) {
                        ch[nx] = 1;
                        Q.offer(nx);
                    }
                }
            }
            L++;
        }
        return 0;
    }

    public static void main(String[] args) {
        Main2 T = new Main2();
        Scanner kb = new Scanner(System.in);
        int s = kb.nextInt(); // 현재 위치
        int e = kb.nextInt(); // 송아지의 위치
        System.out.println(T.BFS(s, e));
    }
}
