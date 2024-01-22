package 문자열.단어뒤집기;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_A {
    public ArrayList<String> solution(int n, String[] str){
        ArrayList<String> answer = new ArrayList<>();
        for(String x : str){
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }
        return answer;
    }
    public static void main(String[] args) {
        Main_A m = new Main_A();
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        String[] str = new String[num];
        for(int i=0;i<num;i++){
            str[i]=scan.next();
        }
        for(String x : m.solution(num,str)){
            System.out.println(x);
        }
    }
}
