package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class No11179 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> list = new ArrayList<>();
        int n = Integer.parseInt(br.readLine());

        while (n > 0) {
            list.add(n % 2);
            n /= 2;
        }

        System.out.println(list);


        br.close();
    }

}