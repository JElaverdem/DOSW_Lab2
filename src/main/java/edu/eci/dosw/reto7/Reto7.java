package eci.dosw.reto7;

public class Reto7 {
	public static void run() {
		User juan = new User("Juan");
		User brian = new User("Brian");

		WindowBlind persiana = new WindowBlind(0);
		Light luzSala = new Light();
		MusicSystem estereo = new MusicSystem(10);
		Door puertaPrincipal = new Door();
		RemoteControl control = new RemoteControl();

		Command abrirPersiana = new MoveBlindCommand(persiana, 100);
		Command encenderLuz = new TurnOnLightCommand(luzSala);
		Command subirVolumen = new AdjustVolumeCommand(estereo, 50);
		Command abrirPuerta = new OperateDoorCommand(puertaPrincipal, true);

		System.out.println("--- Executing actions ---");
		control.executeCommand(abrirPersiana, juan);
		control.executeCommand(encenderLuz, brian);
		control.executeCommand(subirVolumen, juan);
		control.executeCommand(abrirPuerta, brian);

		System.out.println("--- Initial audit ---");
		control.printSummary();

		System.out.println("--- Undoing the last two actions ---");
		control.undoLast();
		control.undoLast();

		System.out.println("--- Final audit ---");
		control.printSummary();
	}

	public static void main(String[] args) {
		run();
	}
}