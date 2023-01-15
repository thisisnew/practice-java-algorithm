package goorm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 피자쿠폰 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Pizza pizza = new Pizza();
        System.out.println(pizza.getSumPizzas(n, m));
    }
}

class Pizza {

    public int getSumPizzas(int n, int m) {
        int result = n;
        int coupons = n;

        while (coupons >= m) {
            result += coupons / m;
            coupons = coupons / m + coupons % m;
        }

        return result;
    }

}
