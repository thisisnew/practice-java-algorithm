package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No32778 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        boolean hasSubName = false;
        String stationName = "";
        String subStationName = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                hasSubName = true;
                break;
            }

            stationName.append(s.charAt(i));
        }


        br.close();
    }
}