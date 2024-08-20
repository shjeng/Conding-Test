import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int V = scan.nextInt();

        int day = 0;
        if (A > V) {
            day = 1;
        } else {
            day = (V - B) % (A - B) == 0 ? (V - B) / (A - B) : (V - B) / (A - B) +1;
        }

        System.out.println(day);
    }
}