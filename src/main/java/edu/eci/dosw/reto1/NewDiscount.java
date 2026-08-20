package edu.eci.dosw.reto1;

public class NewDiscount implements Discount{
    public NewDiscount (){

    }

    public double execute (Cart cart){
        return cart.getTotal() - cart.getTotal() * 0.05;
    }

    public double getDiscount(Cart cart){
        return cart.getTotal() * 0.05;
    }
}
