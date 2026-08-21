package edu.eci.dosw.reto4;

import java.util.*;

/**
 * Implementación que simula la obtención de tasas externas usando triangulación vía USD.
 */
public class ExternalRateAdapter implements ExchangeStrategy {

    private final Map<Currency, Double> usdPerUnit;

    public ExternalRateAdapter() {
        usdPerUnit = new EnumMap<>(Currency.class);
        // Tasas simuladas (1 unidad de moneda -> cuántos USD vale)
        usdPerUnit.put(Currency.USD, 1.0);
        usdPerUnit.put(Currency.EUR, 1.10);   // 1 EUR = 1.10 USD
        usdPerUnit.put(Currency.JPY, 0.0091); // 1 JPY = 0.0091 USD
        usdPerUnit.put(Currency.COP, 0.00027); // 1 COP = 0.00027 USD
    }

    private double toUsd(Currency c) {
        Double v = usdPerUnit.get(c);
        if (v == null) throw new IllegalArgumentException("Unsupported currency: " + c);
        return v;
    }

    @Override
    public double getConversionRate(Currency source, Currency target) {
        if (source == target) return 1.0;
        double sourceInUsd = toUsd(source);
        double targetInUsd = toUsd(target);
        return sourceInUsd / targetInUsd;
    }
}
