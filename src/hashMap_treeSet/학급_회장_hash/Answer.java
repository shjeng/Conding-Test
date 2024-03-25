package hashMap_treeSet.학급_회장_hash;

import java.util.HashMap;
import java.util.Scanner;

public class Answer {
    public static void main(String[] args) {
        Answer T = new Answer();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String str = kb.next();
        System.out.println(T.solution(n, str));
    }

    private char solution(int n, String str) {
        char answer = ' ';
        HashMap<Character, Integer> map = new HashMap<>();
        for(char x : str.toCharArray()){
            map.put(x, map.getOrDefault(x,0)+1); // map.getOrDefault() => 키의 값을 가져오는데, 만약 키가 없으면 디폴트 값을 가져옴.
        }
        int max = 0;
        for (Character key : map.keySet()) {
            if(map.get(key)>max){
                max = map.get(key);
                answer = key;
            }
        }

        return answer;
    }


}
