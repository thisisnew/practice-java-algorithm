package leetcode;

public class StringCompression {
    public int compress(char[] chars) {

        StringBuilder sb = new StringBuilder();
        char prev = chars[0];
        int count = 1;

        for (int i = 1; i < chars.length; i++) {
            char c = chars[i];

            if (c == prev) {
                count++;
                continue;
            }

            sb.append(prev);

            if (count > 1) {
                sb.append(count);
            }

            prev = c;
            count = 1;
        }

        sb.append(prev);

        if (count > 1) {
            sb.append(count);
        }

        return sb.length();
    }
}
