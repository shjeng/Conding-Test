import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        Long A = Long.parseLong(st.nextToken());
        Long B = Long.parseLong(st.nextToken());
        Long V = Long.parseLong(st.nextToken());

        Long day = 0L;
        if (A > V) {
            day = 1L;
        } else {
            day = (V - B) % (A - B) == 0 ? (V - B) / (A - B) : (V - B) / (A - B) +1;
        }

        System.out.println(day);
    }
}