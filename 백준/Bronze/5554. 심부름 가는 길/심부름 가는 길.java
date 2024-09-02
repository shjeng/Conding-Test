import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer stringBuffer = new StringBuffer();
        int answer = 0;
        for (int i = 0; i <4; i++) {
            StringTokenizer sto = new StringTokenizer(bufferedReader.readLine());
            answer += Integer.parseInt(sto.nextToken());
        }
        stringBuffer.append(answer / 60).append("\n").append(answer % 60);
        System.out.println(stringBuffer);
    }
}