package main.java.edu.eci.dosw.reto4;

public class ExternalRateAdapter implements ExchangeStrategy {
    public double  getConversionRate(Currency source, Currency target){
        return source/target;
    }
}
