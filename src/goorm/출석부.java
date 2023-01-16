package goorm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 출석부 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        List<String> names = new ArrayList<>();
        Map<String, List<Double>> infos = new HashMap<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            double height = Double.parseDouble(st.nextToken());

            names.add(name);

            if (!infos.containsKey(name)) {
                infos.put(name, Arrays.asList(height));
                continue;
            }

            List<Double> heights = infos.get(name);
            heights.add(height);
            Collections.sort(heights);

            infos.put(name, heights);
        }

        Collections.sort(names);

        int idx = 0;
        for (String name : names) {
            List<Double> heights = infos.get(name);

            for (double height : heights) {
                idx++;

                if (idx == k) {
                    System.out.println(name + " " + height);
                }
            }
        }
    }
}