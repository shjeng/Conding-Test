import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int answer = 0;
        List<Integer> list = new LinkedList<>();
        for (int i = N; i >= 1; i--) {
            if (N % i == 0 ) {
                if (list.contains(N / i)) {
                    continue;
                }
                list.add(N / i);
            }
        }
        if (list.size() >= K) {
            answer = list.get(K - 1);
        }

        System.out.println(answer);

//         25==1   12==2   6==4  5==5   4
    }
}