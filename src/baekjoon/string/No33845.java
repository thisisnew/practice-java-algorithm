package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class No33845 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        String t = br.readLine();

        Set<Character> sSet = s.chars()
                .mapToObj(c -> (char) c)
                .collect(HashSet::new, Set::add, Set::addAll);

        StringBuilder sb = new StringBuilder();

        for (char c : t.toCharArray()) {
            if (!sSet.contains(c)) {
                sb.append(c);
            }
        }

        System.out.println(sb);
        br.close();
    }
}