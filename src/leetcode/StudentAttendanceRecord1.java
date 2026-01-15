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
        var lCnt = 0;

        for (var c : s.toCharArray()) {
            switch (c) {
                case 'A': {
                    lCnt = 0;
                    aCnt++;

                    if (aCnt >= 2) {
                        return false;
                    }

                    break;
                }
                case 'L': {
                    lCnt++;

                    if (lCnt >= 3) {
                        return false;
                    }

                    break;
                }
                default: {
                    lCnt = 0;
                    break;
                }
            }
        }

        return true;
    }
}
