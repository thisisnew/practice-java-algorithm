package leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudentAttendanceRecord1 {

    public static void main(String[] args) throws IOException {
        var br =  new BufferedReader(new InputStreamReader(System.in));
        System.out.println(checkRecord(br.readLine()));
    }

    private static boolean checkRecord(String s) {

        var aCnt = 0;
        var lSb = new StringBuilder();

        for (var c : s.toCharArray()) {
            if (c == 'P') {
                lSb = new StringBuilder();
                continue;
            }

            if (c == 'A') {
                lSb = new StringBuilder();
                aCnt++;

                if (aCnt >= 2) {
                    return false;
                }
            }

            if (c == 'L') {
                lSb.append(c);

                if (lSb.length() >= 3) {
                    return false;
                }
            }
        }

        return true;
    }
}
