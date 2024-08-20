import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer stringBuffer = new StringBuffer();
        while (true) {
            String[] inputs = reader.readLine().split(" ");
            int first = Integer.parseInt(inputs[0]);
            int second = Integer.parseInt(inputs[1]);
            String answer = "neither";

            if (first == 0 && second == 0) {
                break;
            }
            int max = Math.max(first, second);
            int min = Math.min(first, second);
            if (max % min == 0) {
                if (first > second) {
                    answer = "multiple";
                } else {
                    answer = "factor";
                }
            }
            stringBuffer.append(answer).append("\n");
        }
        System.out.println(stringBuffer.toString());
    }
}