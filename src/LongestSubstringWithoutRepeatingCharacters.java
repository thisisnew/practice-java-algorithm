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

        for (var i = 0; i < s.length()-1; i++) {
            var c = s.charAt(i);
            var set = new HashSet<Character>();
            var count = 0;

            for (var j = i+1; j < s.length(); j++) {
                if (set.contains(c)) {
                    break;
                }

                count++;
                set.add(c);
            }

            if (count > result) {
                result = count;
            }
        }

        return result;
    }
}
