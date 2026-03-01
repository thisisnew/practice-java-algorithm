package leetcode;

import java.io.IOException;

public class LongPressedName {
    public static void main(String[] args) throws IOException {
        System.out.println(isLongPressedName("", ""));
    }

    private static boolean isLongPressedName(String name, String typed) {

        var offset = 0;

        while(offset < name.length()) {
            var c = name.charAt(offset);

            if (offset == name.length() - 1) {

            }

            if (c == name.charAt(offset +1)) {
                offset++;
            }


        }


        return false;
    }
}
