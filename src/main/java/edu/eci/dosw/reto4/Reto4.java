package eci.dosw.reto4;
import java.util.*;

/**
 * Clase de demostración que utiliza las clases extraídas para el Reto 4.
 */
public class Reto4 {

    public static void run() {
        ExchangeStrategy adapter = new ExternalRateAdapter();
        ConversionService service = new ConversionService(adapter);

        Transaction t1 = service.convert(100.0, Currency.EUR, Currency.USD);
        Transaction t2 = service.convert(10000.0, Currency.JPY, Currency.COP);
        Transaction t3 = service.convert(500000.0, Currency.COP, Currency.EUR);

        System.out.println("T1: " + t1.getOriginalAmount() + " " + t1.getSourceCurrency() + " -> " + t1.getConvertedAmount() + " " + t1.getTargetCurrency());
        System.out.println("T2: " + t2.getOriginalAmount() + " " + t2.getSourceCurrency() + " -> " + t2.getConvertedAmount() + " " + t2.getTargetCurrency());
        System.out.println("T3: " + t3.getOriginalAmount() + " " + t3.getSourceCurrency() + " -> " + t3.getConvertedAmount() + " " + t3.getTargetCurrency());

        List<Transaction> list = Arrays.asList(t1, t2, t3);
        double houseBalance = service.processMultiple(list);
        System.out.println("Balance de la casa de cambio (suma de converted amounts): " + houseBalance);
    }
}
