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
        var set = new HashSet<Character>();
        var result = 0;

        for (var i = 0; i < s.length(); i++) {
            var c = s.charAt(i);

            if (!set.contains(c)) {
                result++;
            }

            set.add(c);
        }

        return result;
    }
}
