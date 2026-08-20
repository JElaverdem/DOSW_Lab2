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
        
    }
}
