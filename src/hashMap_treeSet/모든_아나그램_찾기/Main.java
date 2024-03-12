package hashMap_treeSet.모든_아나그램_찾기;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = scanner.nextLine();

        int sum = 0, answer = 0;
        for (char c : t.toCharArray()) {
            sum += c;
        }
        int temp = 0;
        for(int i=0;i<t.toCharArray().length;i++){
            temp += s.charAt(i);
        }
        if(sum == temp) answer++;

        for (int i=0;i<s.toCharArray().length-t.toCharArray().length;i++) { // length: 9, index = 8까지 / length: 3  /  9 - 3 = 6
            temp -= s.charAt(i);
            temp += s.charAt(t.toCharArray().length+i);
            if(sum == temp) answer++;
        }
        System.out.println(answer);

    }
}
