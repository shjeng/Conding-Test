import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Set<String> sangen = new HashSet<>(Arrays.asList(br.readLine().split(" ")));

        int M = Integer.parseInt(br.readLine());
        String[] checkList = br.readLine().split(" ");
        for (int i = 0; i < M; i++) {
            if (sangen.contains(checkList[i])) {
                System.out.print("1 ");
            } else {
                System.out.print("0 ");
            }
        }
    }

    /*
    * HashSet 사용하기
        HashSet은 내부적으로 해시 테이블을 사용하여 평균 O(1) 시간에 contains() 검사를 할 수 있습니다.
        따라서 List 대신 HashSet으로 바꾸면 전체 알고리즘의 시간 복잡도를 크게 줄일 수 있습니다.

        정렬 후 이진 탐색(Binary Search) 사용하기
        배열이나 리스트를 정렬한 후, 이진 탐색을 사용하면 O(log N) 시간에 검사할 수 있습니다.
        하지만 HashSet을 사용하는 방법이 더 간단하고 직관적입니다.
    * */
}
