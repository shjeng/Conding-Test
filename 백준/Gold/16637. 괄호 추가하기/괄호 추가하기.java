import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int[] nums; // 숫자
    static char[] ops; // 부호
    static long maxVal = Long.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        String str = bufferedReader.readLine();

        nums = new int[(N + 1) / 2];
        ops = new char[N / 2];


        for (int i = 0; i < (N + 1) / 2; i++) {
            nums[i] = str.charAt(i * 2) - '0';
            if (i < ops.length) {
                ops[i] = str.charAt(i * 2 + 1);
            }
        }

        solution(0, nums[0]);
        System.out.println(maxVal);
        /*처음엔 다 더함
         * 다음 처음 더하고 괄호 후 다 더함
         * 처음 더하고 괄호 괄호
         * 백트래킹
         * */
    }

    public static long compute(long a, long b, char operation) {
        switch (operation) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            default:
                return a / b;
        }
    }

    public static void solution(int index, long currentVal) {
        if (index >= ops.length) {
            maxVal = Math.max(currentVal, maxVal);
            return;
        }

        // 순서대로 모두 더하기
        long nextVal = compute(currentVal, nums[index + 1], ops[index]);
        solution(index + 1, nextVal);

        // Option 2: 현재 연산자에 괄호를 추가하여 다음 연산자를 미리 계산
        if (index + 1 < ops.length) { // 다음 연산자가 있는 경우에만 괄호 추가 가능
            // 괄호 안의 연산 먼저 계산
            long temp = compute(nums[index + 1], nums[index + 2], ops[index + 1]);
            // 현재 값과 괄호 계산 결과를 연산
            long newValue = compute(currentVal, temp, ops[index]);
            solution(index + 2, newValue); // 괄호를 추가했으므로 다음 연산자는 건너뜀
        }
    }
}