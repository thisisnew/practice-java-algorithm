package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.NumberFormat;
import java.util.Locale;

public class JavaCurrencyFormatter {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        var payment = Double.parseDouble(br.readLine());
        var usCurrency = NumberFormat.getCurrencyInstance(Locale.US);
        var indiaCurrency = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        var chinaCurrency = NumberFormat.getCurrencyInstance(Locale.CHINA);
        var frenchCurrency = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        System.out.println("US: " + usCurrency.format(payment));
        System.out.println("India: " + indiaCurrency.format(payment));
        System.out.println("China: " + chinaCurrency.format(payment));
        System.out.println("France: " + frenchCurrency.format(payment));
    }
}
