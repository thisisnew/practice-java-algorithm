package goorm;

import java.io.*;
import java.util.*;

public class 출석부 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Map<Double, String> infos = new HashMap<>();
        List<Double> heights = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            String name = st.nextToken();
            Double height = Double.parseDouble(st.nextToken());
            infos.put(height, name);
            heights.add(height);
        }
        
        Double ans = heights.get(k - 1);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(infos.get(ans) + "\t" + ans);
        bw.flush();
        bw.close();
    }

}