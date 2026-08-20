package eci.dosw.reto4;

public interface ExchangeStrategy {
    double getConversionRate(Currency source, Currency target);
}
