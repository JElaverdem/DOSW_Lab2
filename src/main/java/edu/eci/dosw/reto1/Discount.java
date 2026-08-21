package eci.dosw.reto1;

public interface Discount{
    double execute(Cart cart);
    double getDiscount(Cart cart);
}