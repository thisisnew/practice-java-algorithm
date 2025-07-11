package baekjoon.datastructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class No25192 {

    private static final String STR_ENTER = "ENTER";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Set<String> names = new HashSet<>();
        int result = 0;
        for (int i = 0; i < n; i++) {
            String input = br.readLine();

            if (STR_ENTER.equals(input)) {
                names = new HashSet<>();
                continue;
            }

            if (!names.contains(input)) {
                names.add(input);
                result++;
            }
        }

        System.out.println(result);
        br.close();
    }
}
