package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class No10824 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<String> list = new ArrayList<>(4);
        StringTokenizer st = new StringTokenizer(br.readLine());

        while (st.hasMoreTokens()) {
            list.add(st.nextToken());
        }

        String v1 = concat(list.get(0), list.get(1));
        String v2 = concat(list.get(2), list.get(3));

        System.out.println(plus(v1, v2));

        br.close();
    }

    private static String concat(String a, String b) {
        return a.concat(b);
    }

    private static int plus(String a, String b) {
        return Integer.parseInt(a) + Integer.parseInt(b);
    }
}
