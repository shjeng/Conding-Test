package bfs.송아지찾기;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main2 {
    /*
    * 처음에 5에서 1과 -1, 5 이렇게 3개를 더해줌
    * 처음 5였을 때의 콩콩이 탄 횟수는 0
    * 1, -1, 5일 때는 횟수가 1
    * 그러면 6, 4, 10 이렇게 됨 즉, 6,4,10은 답이 아니니 배열에 넣어준 뒤에 저 숫자가 나오면 패스
    *
    * */
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
                int x = Q.poll(); // 처음이 5라면
                for (int j = 0; j < 3; j++) {
                    int nx = x+dis[j]; // 5에다가 1, -1, 5를 더해주는 작업
                    if (nx == e) return L + 1;
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
