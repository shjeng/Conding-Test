import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> answer = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            int a = Integer.parseInt(br.readLine());
            answer.add(a);
            sum += a;
        }
        answer = answer.stream().sorted().collect(Collectors.toList());
        System.out.println(sum/5);
        System.out.println(answer.get(2));
    }

}
