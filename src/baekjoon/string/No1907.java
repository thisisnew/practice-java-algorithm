package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1907 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        String[] fSplit = splitStr(s, "+");
        String m1 = splitStr(s, "+")[0];
        String[] sSplit = splitStr(fSplit[1], "=");
        String m2 = sSplit[0];
        String m3 = sSplit[1];


        br.close();
    }

    private static String[] splitStr(String s, String separator) {
        return s.split(separator);
    }
}
