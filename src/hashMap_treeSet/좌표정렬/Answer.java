package hashMap_treeSet.좌표정렬;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Answer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Point> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            arr.add(new Point(x, y));
        }
        Collections.sort(arr);
        for (Point point : arr) {
            System.out.println(point.x + " " + point.y);
        }

    }
}

class Point implements Comparable<Point> {
    public int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        // 내림차순으로 정렬.
        // 내가 가지고 있는 숫자와 새로 들어온 숫자를 비교.
        // 내가 가지고 있는 숫자가 작으면 오름차순
        // 반대면 내림차순
        if (this.x == o.x) return this.y - o.y;
        else return this.x - o.x;
    }
}