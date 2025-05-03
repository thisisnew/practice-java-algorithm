package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class No28445 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        String fBodyColor = st.nextToken();
        String fTailColor = st.nextToken();

        st = new StringTokenizer(br.readLine());
        String mBodyColor = st.nextToken();
        String mTailColor = st.nextToken();

        String[] colors = { fBodyColor, fTailColor, mBodyColor, mTailColor };
        Set<String> colorCombos = new HashSet<>();

        for (String color1 : colors) {
            for (String color2 : colors) {
                colorCombos.add(color1 + " " + color2);
            }
        }

        colorCombos
                .stream()
                .sorted()
                .forEach(System.out::println);

        br.close();
    }
}