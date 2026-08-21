package eci.dosw.reto5;
import java.util.stream.Collectors;
import java.util.stream.Collector;

 public class CoffeeCollector{
    public Collector<Coffee, ?, Double> summarizeTotals() {
        return Collectors.summingDouble(Coffee::getTotalPrice);
    }
 }