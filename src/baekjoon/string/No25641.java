package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class No25641 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sCnt = 0;
        int tCnt = 0;

        int n = Integer.parseInt(br.readLine());

        char[] chars = br.readLine().toCharArray();
        Queue<Character> q = new LinkedList<>();

        for (char c : chars) {
            if (c == 's') {
                sCnt++;
            }

            if (c == 't') {
                tCnt++;
            }

            q.add(c);
        }

        while(tCnt != sCnt) {
            char c = Objects.requireNonNull(q.poll());

            if (c == 's') {
                sCnt--;
            }

            if (c == 't') {
                tCnt--;
            }
        }

        for (char c : q) {
            System.out.print(c);
        }

        br.close();
    }
}