package main.java.edu.eci.dosw.reto1;

public class Customer {
  private String name;
  private Discount discount;
  private static int generalId=1;
  private String id;
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
  public int applyDiscount(){
    return this.discount.execute(getCart());
  }
  public String getId(){
    return this.id;
  }
  public Cart getCart(){
    return this.cart;
  }
  public String getName(){
    return this.name;
  }

}
