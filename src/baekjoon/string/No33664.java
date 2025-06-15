package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class No33664 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        long b = Long.parseLong(st.nextToken()); // 토카의 보유 금액
        int n = Integer.parseInt(st.nextToken()); // 아이템의 수
        int m = Integer.parseInt(st.nextToken()); // 구매하려는 아이템의 수

        Map<String, Long> items = new HashMap<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            items.put(st.nextToken(), Long.parseLong(st.nextToken()));
        }

        long totalPrice = 0;
        for (int i = 0; i < m; i++) {
            String item = br.readLine();
            totalPrice += items.getOrDefault(item, 0L);
        }

        if (totalPrice <= b) {
            System.out.println("acceptable");
        } else {
            System.out.println("unacceptable");
        }

        br.close();
    }
}