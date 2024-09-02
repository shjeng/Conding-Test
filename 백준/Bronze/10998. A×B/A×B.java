import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer sto = new StringTokenizer(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        int A = Integer.parseInt(sto.nextToken());
        int B = Integer.parseInt(sto.nextToken());
        stringBuilder.append(A * B).append("\n");

        System.out.println(stringBuilder);
    }
}