package hubdnc;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class 찍신찾기 {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String questionStr = br.readLine();
        System.out.println(찍신찾기.solution(questionStr));
        br.close();
    }

    public static String solution(String inputStr) {
        /* 문자열 형태로 입력 받으면 숫자만 모두 남겨줌. */
        String[] questionStrs = inputStr.split("[^0-9]+");

        int maxScore = 0, index = 0;
        int[] scores = new int[6];
        for (int i = 1; i < questionStrs.length; i += 2) {
            String questionStr = questionStrs[i];
            String scoreStr = questionStrs[i + 1];

            /* score과 question */
            int question = Integer.parseInt(questionStr);
            int score = Integer.parseInt(scoreStr);

            maxScore = Math.max(score, maxScore);
            /* 점수를 입력해줌.*/
            scores[question] = score;
        }

        /* 응시자가 a, b, c밖에 없으니 하드 코딩으로 찾아줌 */
        List<String> maxScoreStudent = new ArrayList<>();
        int answer1Score = scores[1];
        if (answer1Score == maxScore) {
            maxScoreStudent.add("a : " + maxScore);
        }
        int answer3Score = scores[3];
        if (answer3Score == maxScore) {
            maxScoreStudent.add("b : " + maxScore);
        }
        int answer5Score = scores[5];
        if (answer5Score == maxScore) {
            maxScoreStudent.add("c : " + maxScore);
        }

        return String.join(", ", maxScoreStudent);
    }

}
