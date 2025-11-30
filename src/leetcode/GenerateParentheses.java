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
        List<String> result = new ArrayList<>();
        backtrack(result, new StringBuilder(), 0, 0, n);
        return result;
    }

    private static void backtrack(List<String> result,
                           StringBuilder current,
                           int open,
                           int close,
                           int n) {
        // 길이가 2 * n이면 하나의 조합 완성
        if (current.length() == 2 * n) {
            result.add(current.toString());
            return;
        }

        // 여는 괄호 더 쓸 수 있으면 추가
        if (open < n) {
            current.append('(');
            backtrack(result, current, open + 1, close, n);
            current.deleteCharAt(current.length() - 1); // 되돌리기
        }

        // 닫는 괄호는 항상 open보다 적을 때만
        if (close < open) {
            current.append(')');
            backtrack(result, current, open, close + 1, n);
            current.deleteCharAt(current.length() - 1); // 되돌리기
        }
    }
}
