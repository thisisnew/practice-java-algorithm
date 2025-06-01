package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class No2757 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String s = br.readLine();

            if (s.equals("R0C0")) {
                break;
            }

            Map<String, Integer> rcMap = createRcMap(s);
            int r = rcMap.get("R");
            int c = rcMap.get("C");


        }

        br.close();
    }

    private static Map<String, Integer> createRcMap(String s) {
        String[] split = s.split("C");
        String s1 = split[0];
        String s2 = split[1];

        Map<String, Integer> result = new HashMap<>();
        result.put("R", Integer.parseInt(s1));
        result.put("C", Integer.parseInt(s2));

        return result;
    }
}