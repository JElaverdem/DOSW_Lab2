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
    }
}
