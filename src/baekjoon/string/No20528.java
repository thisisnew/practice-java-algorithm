package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No20528 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        char firstChar = st.nextToken().charAt(0);
        boolean allSame = true;

        for (int i = 1; i < n; i++) {
            if (st.nextToken().charAt(0) != firstChar) {
                allSame = false;
                break;
            }
        }

        System.out.println(allSame ? 1 : 0);
    }
}
