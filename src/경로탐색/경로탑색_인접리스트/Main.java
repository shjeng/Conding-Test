package 경로탐색.경로탑색_인접리스트;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    int n, m, answer = 0;
    List<List<Integer>> graph;
    int[] ch;

    public void DFS(int v) {
        if (v == n) {
            answer++;
        } else { // 13 14 15 34 35   45
            for (int nv : graph.get(v)) {
                if (ch[nv] == 0) {
                    ch[nv] = 1;
                    DFS(nv);
                    ch[nv] = 0;
                }
            }
        }
    }

    // 1 => 2 => 3 =>
    // 3에서 4로간 뒤에 5로가는 거 ok 엔서 1
    // 4에는 3과 5가 있다고 한다면, 3으로 가는 건 위에서 막아야함
    // 4에서5 로 가는 거 앤서 +1

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        main.n = scanner.nextInt();
        main.m = scanner.nextInt();
        main.graph = new ArrayList<>();
        for (int i = 0; i < main.n + 1; i++) {
            main.graph.add(new ArrayList<>());
        }
        main.ch = new int[main.n + 1];
        for (int i = 0; i < main.m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            main.graph.get(a).add(b);
        }
        main.DFS(1);
        System.out.println(main.answer);
    }
}
