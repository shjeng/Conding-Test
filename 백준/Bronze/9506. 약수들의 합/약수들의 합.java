import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            int n = Integer.parseInt(reader.readLine());
            if (n == -1) {
                break;
            }
            List<Integer> list = new ArrayList<>();
            int sum = 0;
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    if (list.contains(i)) {
                        continue;
                    }
                    sum += i;
                    list.add(i);
                }
            }
            if (sum == n) {
                String strs = list.stream().map(String::valueOf).collect(Collectors.joining(" + "));
                sb.append(n).append(" = ").append(strs);
            } else {
                sb.append(n).append(" is NOT perfect.");
            }
            sb.append("\n");

        }
        System.out.println(sb);

    }
}