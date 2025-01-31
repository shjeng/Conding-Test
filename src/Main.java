import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.sort;

public class Main {

    static int answer;
    static int[] answers;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 테스트 케이스 수
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            String[] input = br.readLine().split(" ");
            long x = Long.parseLong(input[0]);
            long y = Long.parseLong(input[1]);

            long distance = y - x;
            if (distance == 0) {
                System.out.println(0);
                continue;
            }

            // k는 distance보다 작거나 같은 최대 정수 sqrt(distance)
            // Math.floor : 내림
            // Math.sqrt: 제곱근
            long k = (long)Math.floor(Math.sqrt(distance));

            // k^2와 k*(k+1)를 계산
            long kSquare = k * k;
            long kTimesKPlus1 = k * (k + 1);

            long steps;
            if (distance == kSquare) {
                steps = 2 * k - 1;
            } else if (distance <= kTimesKPlus1) {
                steps = 2 * k;
            } else {
                steps = 2 * k + 1;
            }

            System.out.println(steps);
        }
    }

    /*
    *
    * <규칙 1>
* max 의 값은 distance 의 루트 값에서 소수점을 버린 정수값이랑 같다.

max = (int) Math.sqrt ( distance ) ;



(참고로 자바에서 루트 값을 구하는 메소드는 Math.sqrt() 이고 double 형이 return 된다.)



<규칙 2>

max 가 변하는 지점과 다음 지점 사이에는 항상 count 가 두 번씩 변한다.

즉, 녹색 구간 사이에 노란색 칸이 두 번 포함된다.



<규칙 3>

녹색 칸 다음에는 반드시 count (노란색) 가 변한다.

이는 당연한게 녹색칸은 Count 가 갈 수 있는 최대 거리이기 때문이다.



<규칙 4>

max 값이 변할 때의 Count 는 다음 수식을 따른다.

Count = ( 2 × max - 1 )
    *
    * */
}
