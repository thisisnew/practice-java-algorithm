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
        String n = br.readLine();

        for (int i = 0; i < n.length(); i++) {
            int i1 = (n.charAt(i) - '0') * (int) Math.pow(2, i);
            list.add(i1);
        }

        System.out.println(list);


        br.close();
    }

}