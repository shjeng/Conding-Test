import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer sto = new StringTokenizer(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        int N = Integer.parseInt(sto.nextToken());
        for (int i = 1; i < 10; i++) {
            stringBuilder.append(N + " * " + i + " = " + (N * i)).append("\n");
        }
        System.out.println(stringBuilder);
    }
}