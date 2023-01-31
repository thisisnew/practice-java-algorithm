package goorm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 사은품교환하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long n = Long.parseLong(st.nextToken()); //시즌
            long m = Long.parseLong(st.nextToken()); // 일반

            System.out.println(countInterchangeableDrinkFromCoupons(n, m));
        }


    }

    private static long countInterchangeableDrinkFromCoupons(long n, long m) {

        int minSeasonalCoupons = 5;
        int availableCount = 12;

        if (n < minSeasonalCoupons || (n + m) < availableCount) {
            return 0;
        }

        long result = Math.min(n / minSeasonalCoupons, m / (availableCount - minSeasonalCoupons));

        n -= minSeasonalCoupons * result;
        m -= (availableCount - minSeasonalCoupons) * result;

        if (n >= minSeasonalCoupons && (n + m) >= availableCount) {
            result++;
            n -= availableCount - m;
        }

        result += n / availableCount;

        return result;
    }
}
