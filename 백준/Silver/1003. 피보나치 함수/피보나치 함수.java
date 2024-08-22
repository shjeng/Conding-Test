import java.io.IOException;
import java.util.Scanner;

public class Main {

    int zero = 0;
    int one = 0;


    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb;
        int n = scanner.nextInt();
        int[] zeros = new int[41];
        int[] ones = new int[41];

        zeros[0] = 1;
        ones[0] = 0;
        zeros[1] = 0;
        ones[1] = 1;

        for (int i = 2; i <= 40; i++) {
            zeros[i] = zeros[i-1] + zeros[i-2];
            ones[i] = ones[i - 1] + ones[i - 2];
        }

        for (int i = 0; i < n; i++) {
            sb = new StringBuilder();
            int temp = scanner.nextInt();
            sb.append(zeros[temp]).append(" ").append(ones[temp]);
            System.out.println(sb.toString());
        }
    }

}