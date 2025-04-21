package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

public class No28691 {
    private static final Map<String, String> CLUB_MAP = Map.of(
        "M", "MatKor",
        "W", "WiCys",
        "C", "CyKor",
        "A", "AlKor",
        "$", "$clear"
    );
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        System.out.println(CLUB_MAP.get(input));
    }
}
