package main.java.edu.eci.dosw.reto1;

public class FrequentDiscount implements Discount{
    public FrequentDiscount(){

    }

    public int execute(Cart cart){
        return cart.getTotal() - cart.getTotal() * 0.1;
    }
}
