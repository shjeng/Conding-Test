package stack_queue.교육과정_설계;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String str2 = scanner.next();
        String answer = "YES";
        int index = 0;

        Queue<Character> queue = new LinkedList<>();
        for (char c : str2.toCharArray()) {
            queue.add(c);
        }

        Iterator<Character> iterator = queue.iterator();
        while (iterator.hasNext()){
            Character c = iterator.next();
            if(index == str.length()){
                break;
            }
            if(c == str.charAt(index)){
                index++;
            };
        }
        if(index != str.length()) answer ="NO";
        System.out.println(answer);
    }
}
