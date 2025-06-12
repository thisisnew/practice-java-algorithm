package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No32778 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        boolean hasSubName = false;
        int idx = 0;
        String stationName = "";
        String subStationName = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                hasSubName = true;
                idx = i;
                break;
            }
        }

        if (hasSubName) {
            stationName = s.substring(0, idx);
            subStationName = s.substring(idx + 1, s.length() - 1);
        } else {
            stationName = s;
            subStationName = "-";
        }

        System.out.println(stationName);
        System.out.println(subStationName);
        br.close();
    }
}