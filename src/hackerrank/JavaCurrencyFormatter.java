package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaCurrencyFormatter {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String s = br.readLine();

            try {
                long x = Long.parseLong(s);
                System.out.println(x+" can be fitted in:");

                if(x>=-128 && x<=127) {
                    System.out.println("* byte");
                }

                if(x>=Short.MIN_VALUE && x<=Short.MAX_VALUE) {
                    System.out.println("* short");
                }

                if(x>=Integer.MIN_VALUE && x<=Integer.MAX_VALUE) {
                    System.out.println("* int");
                }

                System.out.println("* long");
            } catch(Exception e) {
                System.out.println(s +" can't be fitted anywhere.");
            }
        }
    }
}
