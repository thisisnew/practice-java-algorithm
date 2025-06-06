package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class No32158 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        char[] chars = new char[n];
        String s = br.readLine();

        Queue<Integer> pIndexes = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            chars[i] = c;

            if (c == 'p') {
                pIndexes.add(i);
            }
        }

        for (int i = 0; i < chars.length; i++) {
            if (s.charAt(i) == 'c') {
                Integer polled = pIndexes.poll();
                if (Objects.nonNull(polled)) {
                    chars[i] = 'p';
                    chars[polled] = 'c';
                }
            }
        }

        System.out.println(chars);
        System.out.println(Arrays.toString(chars));

        br.close();
    }
}