package leetcode;

public class StringCompression {

    public static void main(String[] args) {
        System.out.println(new StringCompression().compress(new char[] {'a', 'a', 'b', 'b', 'c', 'c', 'c'}));
    }

    public int compress(char[] chars) {

        char prev = chars[0];
        int count = 1;
        int readIdx = 1;
        int writeIdx = 0;

        while (readIdx < chars.length) {
            char c = chars[readIdx];

            if (c == prev) {
                readIdx++;
                count++;
                continue;
            }

            chars[writeIdx++] = prev;

            if (count > 1) {
                String countString = String.valueOf(count);
                for (int i = 0; i < countString.length(); i++) {
                    chars[writeIdx++] = countString.charAt(i);
                }
            }

            prev = c;
            count = 1;
            readIdx++;
        }

        chars[writeIdx++] = prev;

        if (count > 1) {
            String countString = String.valueOf(count);
            for (int i = 0; i < countString.length(); i++) {
                chars[writeIdx++] = countString.charAt(i);
            }
        }

        return writeIdx;
    }
}
