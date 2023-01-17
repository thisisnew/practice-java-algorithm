package goorm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class 최장맨해튼거리 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        List<Integer> list = new ArrayList<>();

        while (st.hasMoreTokens()) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        int max = 0;

        int x1 = list.get(0);
        int x2 = list.get(1);
        int y1 = list.get(2);
        int y2 = list.get(3);

        if (x1 >= x2 && y1 >= y2) {
            max = getSubtractBetweenTwoNumbers(x1, x2) + getSubtractBetweenTwoNumbers(y1, y2);
        }

        if (x2 >= x1 && y1 >= y2) {
            max = getSubtractBetweenTwoNumbers(x2, x1) + getSubtractBetweenTwoNumbers(y1, y2);
        }

        if (x1 >= x2 && y2 >= y1) {
            max = getSubtractBetweenTwoNumbers(x1, x2) + getSubtractBetweenTwoNumbers(y2, y1);
        }

        if (x2 >= x1 && y2 >= y1) {
            max = getSubtractBetweenTwoNumbers(x2, x1) + getSubtractBetweenTwoNumbers(y2, y1);
        }


        System.out.println(max);
    }

    private static int getSubtractBetweenTwoNumbers(int a, int b) {
        return Math.abs(a - b);
    }


}

