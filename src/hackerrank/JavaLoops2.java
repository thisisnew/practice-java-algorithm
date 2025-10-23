package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class JavaLoops2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i <n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            for (int j = 0; j < c; j++) {
                System.out.print(cal(a, b, j));

                if (j < c - 1) {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }

    private static int cal(int a, int b, int c) {

        int sum = 0;

        for (int j = 0; j <=c; j++) {
            sum += (int) (Math.pow(2, j) * b);
        }

        return a + sum;
    }
}
