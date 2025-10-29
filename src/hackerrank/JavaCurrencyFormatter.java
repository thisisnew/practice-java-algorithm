package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

public class JavaCurrencyFormatter {
    private static String normalizeSpaces(String s) {
        return s.replace('\u00A0', ' ').replace('\u202F', ' ');
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double payment = Double.parseDouble(br.readLine());

        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);

        NumberFormat india = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        if (india instanceof DecimalFormat) {
            DecimalFormat df = (DecimalFormat) india;
            DecimalFormatSymbols syms = df.getDecimalFormatSymbols();
            syms.setCurrencySymbol("Rs.");
            df.setDecimalFormatSymbols(syms);
        }

        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        if (china instanceof DecimalFormat) {
            DecimalFormat df = (DecimalFormat) china;
            DecimalFormatSymbols syms = df.getDecimalFormatSymbols();
            syms.setCurrencySymbol("￥"); // U+FFE5
            df.setDecimalFormatSymbols(syms);
        }

        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        String usOut = normalizeSpaces(us.format(payment));
        String inOut = normalizeSpaces(india.format(payment));
        String cnOut = normalizeSpaces(china.format(payment));
        String frOut = normalizeSpaces(france.format(payment));

        System.out.println("US: " + usOut);
        System.out.println("India: " + inOut);
        System.out.println("China: " + cnOut);
        System.out.println("France: " + frOut);
    }
}
