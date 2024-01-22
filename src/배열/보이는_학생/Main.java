package 배열.보이는_학생;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int count = 1;
        int height = scan.nextInt();
        for(int i=0;i<num-1;i++){
            int next = scan.nextInt();
            if(next>height){
                count++;
                height = next;
            }
        }
        System.out.println(count);
    }
}
