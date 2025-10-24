package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaDataTypes {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String n = br.readLine();

            boolean canParseByte = canParseByte(n);
            boolean canParseShort = canParseShort(n);
            boolean canParseInt = canParseInt(n);
            boolean canParseLong = canParseLong(n);

            if (!canParseByte && !canParseShort && !canParseInt && !canParseLong) {
                System.out.printf("%s %s", n, "n can't be fitted anywhere.");
                continue;
            }

            System.out.printf("%s %s", n, "n can be fitted in:");

            if (canParseByte) {
                System.out.println("* byte");
            }

            if (canParseShort) {
                System.out.println("* short");
            }

            if (canParseInt) {
                System.out.println("* int");
            }

            if (canParseLong) {
                System.out.println("* long");
            }
        }
    }

    private static boolean canParseByte(String n) {
        try {
            Byte.parseByte(n);
        } catch (Exception ignored){
            return false;
        }

        return true;
    }

    private static boolean canParseShort(String n) {
        try {
            Short.parseShort(n);
        } catch (Exception ignored){
            return false;
        }

        return true;
    }

    private static boolean canParseInt(String n) {
        try {
            Integer.parseInt(n);
        } catch (Exception ignored){
            return false;
        }

        return true;
    }

    private static boolean canParseLong(String n) {
        try {
            Long.parseLong(n);
        } catch (Exception ignored){
            return false;
        }

        return true;
    }
}
