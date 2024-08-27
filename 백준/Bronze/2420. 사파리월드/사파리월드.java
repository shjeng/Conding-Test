import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer sto = new StringTokenizer(bufferedReader.readLine());

        Long N = Long.parseLong(sto.nextToken());
        Long M = Long.parseLong(sto.nextToken());
        System.out.println(Math.abs(N - M));


    }

}