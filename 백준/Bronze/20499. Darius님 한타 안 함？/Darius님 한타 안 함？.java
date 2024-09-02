import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] kda = bufferedReader.readLine().split("/");


        int k = Integer.parseInt(kda[0]), d = Integer.parseInt(kda[1]), a = Integer.parseInt(kda[2]);
        String answer = k + a < d || d== 0? "hasu" : "gosu";
        System.out.println(answer);
    }
}