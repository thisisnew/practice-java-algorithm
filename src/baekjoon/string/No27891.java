package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class No27891 {

    private static final Map<String, String> MAP = Map.of(
            "NLCS", "North London Collegiate School",
            "BHA", "Branksome Hall Asia",
            "KIS", "Korea International School",
            "SJA", "St. Johnsbury Academy"
    );

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();



        br.close();
    }

    private static String trim(String s) {
        return s.trim().replaceAll("\\s+", " ");
    }
}