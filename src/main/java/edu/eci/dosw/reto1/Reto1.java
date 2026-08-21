package eci.dosw.reto1;

public class Reto1 {
    public static void run(){
        Customer custom1=new Customer("Pedro");
        Product papa = new Product("papa", "Una papa natural de la mejor calidad", 500);
        custom1.addItem(papa, 5);

        Product TShirt = new Product("T-Shirt", "A normal white T-Shirt, size Large", 49999);
        custom1.addItem(TShirt, 2);

        custom1.getItems().stream().map(Product::getPrice).forEach(p -> System.out.println(p));
        System.out.println(custom1.getTotalCart());
        System.out.println(custom1.getDiscount());
        System.out.println(custom1.applyDiscount());
    }
}
