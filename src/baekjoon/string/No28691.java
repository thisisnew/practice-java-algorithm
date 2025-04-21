package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No28691 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char input = br.readLine().charAt(0);
        
        String result = switch (input) {
            case 'M' -> "MatKor";
            case 'W' -> "WiCys";
            case 'C' -> "CyKor";
            case 'A' -> "AlKor";
            case '$' -> "$clear";
            default -> throw new IllegalArgumentException();
        };

        System.out.println(result);
    }
}
