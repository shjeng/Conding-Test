import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.sort;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        String[] strs1 = bufferedReader.readLine().split(" ");
        String[] strs2 = bufferedReader.readLine().split(" ");
        List<Integer> nums1 = new ArrayList<>(), nums2 = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            nums1.add(Integer.parseInt(strs1[i]));
            nums2.add(Integer.parseInt(strs2[i]));
        }

        sort(nums1);
        sort(nums2, Collections.reverseOrder());

        int answer = 0;
        for (int i = 0; i < N; i++) {
            answer += nums1.get(i) * nums2.get(i);
        }
        System.out.println(answer);
    }
}