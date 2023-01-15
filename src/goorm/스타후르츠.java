package goorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 스타후르츠 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n, t, c, p;

        n = Integer.parseInt(st.nextToken()); //여름 일 수
        t = Integer.parseInt(st.nextToken()); //자라는데 걸리는 일 수
        c = Integer.parseInt(st.nextToken()); //칸 수
        p = Integer.parseInt(st.nextToken()); //개당 가격 정수

        StarFruit starFruit = new StarFruit();
        System.out.println(starFruit.solution(n, t, c, p));
    }
}

class StarFruit {

    public int solution(int n, int t, int c, int p) {
        return getPrice(getTotalCount(n, t, c), p);
    }

    private int getTotalCount(int n, int t, int c) {
        return ((n - 1) / t) * c;
    }

    public int getPrice(int count, int price) {
        return count * price;
    }

}