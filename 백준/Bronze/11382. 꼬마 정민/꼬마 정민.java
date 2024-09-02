import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer sto = new StringTokenizer(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        BigInteger A = new BigInteger(sto.nextToken());
        BigInteger B = new BigInteger(sto.nextToken());
        BigInteger C = new BigInteger(sto.nextToken());
        stringBuilder.append(A.add(B).add(C));
        System.out.println(stringBuilder);
    }
}