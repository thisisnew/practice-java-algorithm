package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class No27891 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        var map = Map.of(
                "NLCS", "North London Collegiate School",
                "BHA", "Branksome Hall Asia",
                "KIS", "Korea International School",
                "SJA", "St. Johnsbury Academy"
        );

        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();

            String trimmedValue = trimSpecialCharacters(value);
            String lowerCaseValue = toLowerCase(trimmedValue);
            String subStringValue = subString(lowerCaseValue, 0, 10);



        }



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
}