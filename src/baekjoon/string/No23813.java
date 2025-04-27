package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class No23813 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        List<Integer> list = new ArrayList<>();

        for (int i = input.length() - 1; i > 0; i--) {

            String front = input.substring(0, i);
            String back = input.substring(i);

            list.add(Integer.parseInt(back + front));
        }

        System.out.println(list);

        br.close();
    }
}