package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class No31403 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine();
        String b = br.readLine();
        String c = br.readLine();

        System.out.println(calAsInt(a, b, c));
        System.out.println(calAsString(a, b, c));
        br.close();
    }

    private static int calAsInt(String a, String b, String c) {
        return Integer.parseInt(a) + Integer.parseInt(b) - Integer.parseInt(c);
    }

    private static int calAsString(String a, String b, String c) {
        return Integer.parseInt(a + b) - Integer.parseInt(c);
    }
}
