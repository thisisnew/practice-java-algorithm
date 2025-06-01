package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class No2757 {

    private static final String R0C0 = "R0C0";
    private static final String C = "C";
    private static final String R = "R";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String s = br.readLine();

            if (isEnd(s)) {
                break;
            }

            Rc rc = parse(s);
            System.out.println(createRStr(rc.col()) + rc.row());
        }

        br.close();
    }

    private static boolean isEnd(String s) {
        return Objects.equals(R0C0, s);
    }

    private static Rc parse(String s) {
        int rIndex = s.indexOf(R);
        int cIndex = s.indexOf(C);

        int row = Integer.parseInt(s.substring(rIndex + 1, cIndex));
        int col = Integer.parseInt(s.substring(cIndex + 1));

        return new Rc(row, col);
    }

    private static String createRStr(int n) {
        StringBuilder sb = new StringBuilder();

        while (n > 0) {
            n--;
            sb.append((char) ('A' + n % 26));
            n /= 26;
        }

        return sb.reverse().toString();
    }

    private static class Rc {
        private final int row;
        private final int col;

        private Rc(int row, int col) {
            this.row = row;
            this.col = col;
        }

        public int row() {
            return row;
        }

        public int col() {
            return col;
        }
    }
}