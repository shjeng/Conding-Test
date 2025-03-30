package hubdnc;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class 최소_공배수_합 {
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    //    최소 공배수
    public static int lnc(int a, int b) {
        return a * b / gcd(a, b);
    }

    public static void main(String[] args) throws IOException {
//         [ 1 , 2 , 3 ]
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String questionStr = br.readLine();
        System.out.println(최소_공배수_합.solution(questionStr));
        br.close();
    }

    public static int solution(String inputStr) {
        int answer = 0;

        /* 대괄호 제거 */
        inputStr = inputStr.replaceAll("[\\[\\]]", "");
        String[] split = inputStr.split(",");

        // [ 1 , 2 , 3 ] 문자열로 입력했을 경우 공백이 있음으로 trim() 사용
        List<Integer> nums = Arrays.stream(split).map(s -> {return Integer.parseInt(s.trim());}).collect(Collectors.toList());

        for (int i = 0; i < nums.size(); i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                int maxNum = Math.max(nums.get(i), nums.get(j));
                int minNum = Math.min(nums.get(i), nums.get(j));
                answer += lnc(maxNum, minNum);
            }
        }
        return answer;

    }
}
