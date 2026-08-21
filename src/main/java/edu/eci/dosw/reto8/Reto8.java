package eci.dosw.reto8;
public class Reto8{
    public static void run() {
        Caretaker ct= new Caretaker("Juan", 40, "Veterinarian");
        System.out.println(ct.getName());
        System.out.println(ct.getAge());
        System.out.println(ct.getSpecialty());
        Visitor vt= new Visitor("Brian", 40);
        System.out.println(vt.getAge());
        System.out.println(vt.getName());
        Bird bd= new Bird("piolin", 2, "nuts", "corn", 10, 1, HealthStatus.HEALTHY);
        System.out.println(bd.getAge());
        System.out.println(bd.getHeight());
        System.out.println(bd.getPreferredFood());
        System.out.println(bd.getDiet());
        System.out.println(bd.getWeight());
    }
}