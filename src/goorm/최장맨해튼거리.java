package goorm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class 최장맨해튼거리 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        List<Integer> points = new ArrayList<>();

        while (st.hasMoreTokens()) {
            points.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(points);
        System.out.println(getSubtractBetweenTwoNumbers(points.get(0), points.get(2)) + getSubtractBetweenTwoNumbers(points.get(1), points.get(3)));
    }

    private static int getSubtractBetweenTwoNumbers(int a, int b) {
        return Math.abs(a - b);
    }
}

