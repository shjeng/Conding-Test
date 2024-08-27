import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer sto = new StringTokenizer(bufferedReader.readLine());

        BigInteger n = new BigInteger(sto.nextToken());
        BigInteger m = new BigInteger(sto.nextToken());

        System.out.println(n.divide(m));
        System.out.println(n.remainder(m));
    }

}