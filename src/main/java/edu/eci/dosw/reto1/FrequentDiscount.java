package main.java.edu.eci.dosw.reto1;

public class FrequentDiscount implements Discount{
    public FrequentDiscount(){

    }

    public double execute(Cart cart){
        return cart.getTotal() - cart.getTotal() * 0.1;
    }

    public double getDiscount(Cart cart){
        return cart.getTotal() * 0.1;
    }
}
