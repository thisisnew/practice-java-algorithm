package goorm;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class 출석부 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());


        List<String> heights = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            heights.add(br.readLine());
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(heights.get(k - 1));
        bw.flush();
        bw.close();
    }

}