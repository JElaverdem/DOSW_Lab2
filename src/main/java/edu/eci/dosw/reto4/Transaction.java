<<<<<<< HEAD
package eci.dosw.reto4;

public class Transaction{
    private double originalAmount;
    private double convertedAmount;
    private Currency sourceCurrency;
    private Currency targetCurrency;
    public Transaction(double originalAmount, Currency sourceCurrency, Currency targetCurrency, double convertedAmount){
        this.originalAmount=originalAmount;
        this.sourceCurrency=sourceCurrency;
        this.targetCurrency=targetCurrency;
        this.convertedAmount=convertedAmount; 
    }
    public  double getOriginalAmount(){
        return this.originalAmount();
    }
    public  Currency getSourceCurrency(){
        return this.sourceCurrency;
    }
    public double getOriginalAmount(){
        return this.originalAmount;
=======
package edu.eci.dosw.reto4;

/**
 * Representa una transacción de conversión de moneda.
 */
public class Transaction {
    private final double originalAmount;
    private final double convertedAmount;
    private final Currency sourceCurrency;
    private final Currency targetCurrency;

    public Transaction(double originalAmount, double convertedAmount, Currency sourceCurrency, Currency targetCurrency) {
        this.originalAmount = originalAmount;
        this.convertedAmount = convertedAmount;
        this.sourceCurrency = sourceCurrency;
        this.targetCurrency = targetCurrency;
    }

    public double getOriginalAmount() {
        return originalAmount;
    }

    public double getConvertedAmount() {
        return convertedAmount;
    }

    public Currency getSourceCurrency() {
        return sourceCurrency;
    }

    public Currency getTargetCurrency() {
        return targetCurrency;
>>>>>>> feature/Reto4-Rivera
    }
}
