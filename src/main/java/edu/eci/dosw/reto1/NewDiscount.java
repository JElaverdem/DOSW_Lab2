package main.java.edu.eci.dosw.reto1;

public class NewDiscount implements Discount{
    public NewDiscount (){

    }

    public int execute (Cart cart){
        return cart.getTotal() - cart.getTotal() * 0.05;
    }
}
