import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer sto = new StringTokenizer(bufferedReader.readLine());

        Long temp = 0L;

        for (int i = 0; i < 5; i++) {
            int num = Integer.parseInt(sto.nextToken());
            temp += num*num;
        }
        System.out.println(temp % 10);


    }

}