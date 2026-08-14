package main.java.edu.eci.dosw.reto1;
import java.util.ArrayList;
import java.util.List;

public class Cart {
    public ArrayLis<CartItem> items;
    public Cart(){
    items = new ArrayList<>();
    }
    
    public int getTotal() {
    double totalPrice = 0;
   return items.stream()
               .mapToDouble(item -> item.getproduct().getPrice()* item.getQuantity())
                .sum();}
    public void addItem(Product product, int quantity) {
    for (CartItem item : items) {
        if (item.getProduct().equals(product)) {
            item.setQuantity(item.getQuantity() + quantity);
            return;
        }
    }  }
    public void removeItem(Product product) {
    for (CartItem item : items) {
            if (item.getProduct().equals(product)) {
                items.remove(item);
                return;
            }
        }
    }
}



