package goorm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 문제선정하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] questions = new int[n];

        for (int i = 0; i < questions.length; i++) {
            questions[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(questions);

        int level = 0;
        int cnt = 0;
        String result = "NO";

        for (int i = 0; i < questions.length; i++) {
            if (questions[i] > level) {
                level = questions[i];
                cnt++;
            }

            if (cnt == 3) {
                result = "YES";
                break;
            }
        }

        System.out.println(result);
    }
}
