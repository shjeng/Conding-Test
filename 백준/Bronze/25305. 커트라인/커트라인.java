import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] firstInput = br.readLine().split(" ");

        int N = Integer.parseInt(firstInput[0]);
        int k = Integer.parseInt(firstInput[1]);

        List<Integer> answer = new ArrayList<>();

        String[] scoreStr = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            answer.add(Integer.parseInt(scoreStr[i]));
        }
        answer = answer.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(answer.get(k-1));
    }

}
