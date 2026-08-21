package edu.eci.dosw.reto4;

/**
 * Contrato para obtener tasas de conversión entre monedas.
 */
public interface ExchangeStrategy {
    double getConversionRate(Currency source, Currency target);
}
