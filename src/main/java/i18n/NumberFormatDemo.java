package i18n;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatDemo {

    private static final Locale HUN_LOCALE = new Locale("hu", "HU");

    public static void main(String[] args) {
        NumberFormat numberFormat = NumberFormat.getInstance(HUN_LOCALE);
        numberFormat.setMaximumFractionDigits(4);
        numberFormat.setMinimumFractionDigits(4);
        System.out.println(numberFormat.format(121212113.1267567)); // alapesetben három tizedesjegyre kerekít
        System.out.println(numberFormat.format(123));
        String formatted = numberFormat.format(121212113.1267567);
        System.out.println(formatted.contains(" "));
        for (char c: formatted.toCharArray()) {
            System.out.println((int) c);
        }
        // non breaking space: 160-as karakter
        System.out.println((int) ' '); // 32
        try {
            Object o = numberFormat.parse("123\u00A0123\u00A0123,123456");
            System.out.println(o.getClass().getName());
//            Long result = (Long) o;
//            System.out.println(result);
            Double result = (Double) o;
            System.out.println(result);
        }
        catch (ParseException pe) {
            pe.printStackTrace();
        }

        NumberFormat uiParser = NumberFormat.getInstance();
        DecimalFormat decimalFormat = (DecimalFormat) uiParser;
        DecimalFormatSymbols symbols = decimalFormat.getDecimalFormatSymbols();
        symbols.setGroupingSeparator(' ');
        decimalFormat.setDecimalFormatSymbols(symbols);

        try {
            Double value = (Double) uiParser.parse("123 123 123,12345");
            System.out.println(value);
        }
        catch (ParseException pe) {
            pe.printStackTrace();
        }

        System.out.printf("%f\n", 123.12345);
        System.out.printf(Locale.ENGLISH, "%f\n", 123.12345);
        System.out.printf("%,f\n", 123123123.12345);
        System.out.printf("%,20f\n", 123123123.12345);
        System.out.printf("%,20.2f\n", 123123123.12345);

        DecimalFormat custom = (DecimalFormat) NumberFormat.getInstance();
//        custom.applyPattern("###,###.###");
        custom.applyPattern("000,000.000");
        System.out.println(custom.format(123.12345));
        System.out.println(custom.format(123));

        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(HUN_LOCALE);
        System.out.println(currencyFormat.format(123.123));

        NumberFormat percentFormat = NumberFormat.getPercentInstance(HUN_LOCALE);
        System.out.println(percentFormat.format(123.123));
    }
}
