package leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public static void main(String[] args) throws IOException {
        var br =  new BufferedReader(new InputStreamReader(System.in));
        System.out.println(generateParenthesis(Integer.parseInt(br.readLine())));
    }

    private static List<String> generateParenthesis(int n) {

        var result = new ArrayList<String>();

        for (int i = 0; i < n; i++) {
            var s = create(n, i);
            result.add(s);
        }

        return result;
    }

    private static String create(int n, int idx) {
        var sb = new StringBuilder();
        var cnt = 1;

        for (int i = 0; i < n; i++) {
            sb.append('(');
            sb.append(")");
            cnt++;
        }

        return sb.toString();
    }
}
