package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No27866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        int index = Integer.parseInt(br.readLine());
        String[] splitWord = word.split("");
        System.out.print(splitWord[index-1]);
    }
}
