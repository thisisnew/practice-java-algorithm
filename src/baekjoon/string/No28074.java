package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class No28074 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Set<Character> charSet = new HashSet<>();
        boolean available = false;

        for (char c : br.readLine().toCharArray()) {
            if (c != 'M' && c != 'O' && c != 'B' && c != 'I' && c != 'S') {
                continue;
            }

            charSet.add(c);

            if (charSet.size() == 5) {
                available = true;
                break;
            }
        }

        if (available) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        br.close();
    }
}