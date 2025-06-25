package Java_Files.OOP;

import java.text.NumberFormat;
import java.util.Locale;


public class CurrencyCheck {

    public static void main(String[] args) {

        String currency = NumberFormat.getCurrencyInstance().format(45457.56);

        System.out.println(currency);
    }
}
