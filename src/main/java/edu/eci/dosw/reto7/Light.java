package eci.dosw.reto7;

public class Light {
	private boolean on;

	public void turnOn() {
		on = true;
		System.out.println("The light is ON.");
	}

	public void turnOff() {
		on = false;
		System.out.println("The light is OFF.");
	}
}