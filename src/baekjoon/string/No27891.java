package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class No27891 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        var map = new HashMap<String, String>();
        map.put("NLCS", "North London Collegiate School");
        map.put("BHA", "Branksome Hall Asia");
        map.put("KIS", "Korea International School");
        map.put("SJA", "St. Johnsbury Academy");

        String answer = "";
        boolean existsAnswer = false;

        for (Map.Entry<String, String> entry : map.entrySet()) {
            String customized = subString(toLowerCase(trimSpecialCharacters(entry.getValue())), 0, 10);
            char[] chars = customized.toCharArray();

            for (int seq = 0; seq <= 25; seq++) {
                if (nextChar(chars[0], seq) != s.charAt(0)) {
                    continue;
                }

                if (s.equals(nextStr(chars, seq))) {
                    answer = entry.getKey();
                    existsAnswer = true;
                }

                break;
            }

            if (existsAnswer) {
                break;
            }
        }

        System.out.println(answer);
        br.close();
    }

    private static String trimSpecialCharacters(String s) {
        return s.replaceAll("[\\p{Punct}\\s]", "");
    }

    private static String toLowerCase(String s) {
        return s.toLowerCase();
    }

    private static String subString(String s, int start, int end) {
        return s.substring(start, end);
    }

    private static Character nextChar(char c, int seq) {
        return (char) ('a' + (c - 'a' + seq) % 26);
    }

    private static String nextStr(char[] chars, int seq) {
        for (int i = 0; i < chars.length; i++) {
            chars[i] = nextChar(chars[i], seq);
        }

        return new String(chars);
    }
}