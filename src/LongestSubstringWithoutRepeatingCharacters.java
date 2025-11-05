import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) throws IOException {
        var br =  new BufferedReader(new InputStreamReader(System.in));
        System.out.println(lengthOfLongestSubstring(br.readLine()));
    }

    public static int lengthOfLongestSubstring(String s) {
        var result = 0;
        var len = s.length();

        for (var i = 0; i < len; i++) {
            var set = new HashSet<Character>();
            var count = 0;

            for (var j = i; j < len; j++) {
                var c = s.charAt(j);
                if (set.contains(c)) break;

                count++;
                set.add(c);
            }

            if (count > result) result = count;


            if (result >= len - i) break;
        }

        return result;
    }
}
