package main.java.edu.eci.dosw.reto1;

public class NoDiscount implements Discount{
    public NoDiscount(){

    }

    public int execute(Cart cart){
        return cart.getTotal();
    }
}
