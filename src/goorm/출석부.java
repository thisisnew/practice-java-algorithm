package goorm;

import java.io.*;
import java.util.*;

public class 출석부 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Map<String, String> infos = new HashMap<>();
        List<Map<String, String>> heights = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            String name = st.nextToken();
            String height = st.nextToken();
            infos.put(name, height);
            heights.add(infos);
        }

        Map<String, String> result = heights.get(k - 1);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(result + " " + infos.get(result));
        bw.flush();
        bw.close();
    }

}