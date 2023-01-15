package goorm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 접미사배열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        List<String> list = new ArrayList<>();
        int len = input.length();

        for (int i = input.length() - 1; i >= 0; i--) {
            list.add(input.substring(i, len));
        }

        Collections.sort(list);

        for (String result : list) {
            System.out.println(result);
        }
    }
}
