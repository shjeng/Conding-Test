import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int a = Integer.parseInt(br.readLine());
            answer.add(a);
        }
        answer = answer.stream().sorted().collect(Collectors.toList());
        for (int i = 0; i < answer.size(); i++) {
            System.out.println(answer.get(i));
        }
    }

}
