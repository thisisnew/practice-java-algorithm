package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No28255 { //3단 초콜릿 아이스크림

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i=0; i<n; i++) {



        }

    }

    private String rev(String word) {

        StringBuilder result = new StringBuilder(word.length());

        for (int i=word.length()-1; i>=0; i--) {
            result.append(word.charAt(i));
        }

        return result.toString();
    }

    private String tail() {

    }

}
