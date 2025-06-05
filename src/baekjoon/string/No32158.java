package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class No32158 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        Queue<Integer> pIndexes = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'p') {
                pIndexes.add(i);
            }
        }

        char[] sCharArray = s.toCharArray();
        for (int i = 0; i < sCharArray.length; i++) {
            if (s.charAt(i) == 'c') {
                Integer polled = pIndexes.poll();
                if (Objects.nonNull(polled)) {
                    sCharArray[i] = 'p';
                    sCharArray[polled] = 'c';
                }
            }
        }

        System.out.println(Arrays.toString(sCharArray));

        br.close();
    }
}