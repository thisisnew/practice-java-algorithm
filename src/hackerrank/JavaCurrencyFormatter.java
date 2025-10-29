package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.NumberFormat;
import java.util.Locale;

public class JavaCurrencyFormatter {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double payment = Double.parseDouble(br.readLine());

        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat india = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        String usOut = us.format(payment);
        String inOut = india.format(payment);
        String cnOut = china.format(payment);
        String frOut = france.format(payment);

        System.out.println("US: " + usOut);
        System.out.println("India: " + inOut);
        System.out.println("China: " + cnOut);
        System.out.println("France: " + frOut);
    }
}
