package main.java.edu.eci.dosw.reto1;
import java.util.ArrayList;

public class Customer {

  private String name;
  private Discount discount;
  private static int generalId=1;
  private int id;
  private Cart cart;
  public Customer(String name){
    this.name=name;
    this.id=generalId;
    generalId+=1;
    this.cart=new Cart();
    this.discount=new NewDiscount();
  }  
  public void setDiscount(String discount){
  switch(discount){
    case "new":
        this.discount=new FrequentDiscount();
    case "not":
        this.discount=new NoDiscount();

  }}
  public double applyDiscount(){
    return this.discount.execute(getCart());
  }

  public double getDiscount(){
    return this.discount.getDiscount(getCart());
  }

  public double getTotalCart(){
    return getCart().getTotal();
  }
  
  public int getId(){
    return this.id;
  }
  public Cart getCart(){
    return this.cart;
  }
  public String getName(){
    return this.name;
  }

  public void addItem(Product item, int quantity){
    getCart().addItem(item, quantity);
  }

  public ArrayList<Product> getItems(){
    return this.cart.getItems();
  }
}
