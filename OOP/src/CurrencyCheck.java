import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class CurrencyCheck {

    public static void main(String[] args) {

        Locale locale = Locale.getDefault();

        Currency currency = Currency.getInstance(locale);

        NumberFormat cashFormat = NumberFormat.getCurrencyInstance(locale);

        String cashValue = cashFormat.format(34483.98);

        System.out.println(currency.getCurrencyCode());
        System.out.println(cashValue);
    }
}
