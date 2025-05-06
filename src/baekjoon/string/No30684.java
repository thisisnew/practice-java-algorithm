package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class No30684 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        List<String> names = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String name = br.readLine();

            if (name.length() == 3) {
                names.add(name);
            }
        }

        names.sort(String::compareTo);

        System.out.println(names.get(0));
        br.close();
    }
}