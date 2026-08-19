package main.java.edu.eci.dosw.reto1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Cart {
    public Map<Product, Integer> items;
    public Cart(){
    this.items = new HashMap<>();
    }
    
    public void addItem(Product product, int quantity) {
        items.put(product, items.getOrDefault(product, 0+quantity));
    }
    public int getquantity(Product product) {
        return items.getOrDefault(product, 0);
    }
    public void removeItem(Product product) {
        items.remove(product);
    }
            
    public double getTotal(){
        double totalPrice = 0;
        for (Map.Entry<Product,Integer> entry : items.entrySet())
            totalPrice += entry.getKey().getPrice()* entry.getValue();
        return totalPrice;
    }
    public ArrayList<Product> getItems(){
        ArrayList<Product>result=new ArrayList<>(items.keySet());
        return result;
    }
}



