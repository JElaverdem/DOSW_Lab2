import java.util.stream.Collectors;
 public class CoffeeCollector{
    public collector<Coffee, ?, Double> summarizeTotals() {
        return Collectors.summingDouble(Coffee::getTotalPrice);
    }
 }