package main.java.edu.eci.dosw.reto1;
import java.util.hashMap;
import java.util.Map;

public class Cart {
    public Map<> items;
    public Cart(){
    this.items = new hashMap<>();
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
        for (Map<K,V>.Entry<Product,Integrer> entry : items.entryset())
            totalPrice += entry.getKey().getprice()* entry.getValue();
        return totalPrice;
    }
}



