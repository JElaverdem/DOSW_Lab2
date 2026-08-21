<<<<<<< HEAD
package eci.dosw.reto4;
import java.util.List;

public class ConversionService {
    private ExchangeStrategy exchangeStrategy;

    public ConversionService(){
        this.exchangeStrategy = new ExternalRateAdapter();
    }

    public Transaction convert(double amount, Currency source, Currency target){
        this.exchangeStrategy.getConversionRate(source, target);
    }

    public void processMultiple(List<Transaction> transactions){
        
=======
package edu.eci.dosw.reto4;

import java.util.*;

/**
 * Servicio de conversión que usa una estrategia de tasas.
 */
public class ConversionService {
    private final ExchangeStrategy strategy;

    public ConversionService(ExchangeStrategy strategy) {
        this.strategy = strategy;
    }

    public Transaction convert(Double amount, Currency source, Currency target) {
        if (amount == null || source == null || target == null) {
            throw new IllegalArgumentException("Amount and currencies must be non-null");
        }
        double rate = strategy.getConversionRate(source, target);
        double converted = amount * rate;
        return new Transaction(amount, converted, source, target);
    }

    public double processMultiple(List<Transaction> transactions) {
        if (transactions == null) return 0.0;
        return transactions.stream()
            .filter(Objects::nonNull)
            .mapToDouble(Transaction::getConvertedAmount)
            .sum();
>>>>>>> feature/Reto4-Rivera
    }
}
