package main.java.edu.eci.dosw.reto1;

public class NoDiscount implements Discount{
    public NoDiscount(){

    }

    public double execute(Cart cart){
        return cart.getTotal();
    }

    public double getDiscount(Cart cart){
        return 0;
    }
}
