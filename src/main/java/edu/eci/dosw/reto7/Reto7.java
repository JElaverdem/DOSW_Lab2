package edu.eci.dosw.reto7;

public class Reto7 {
    
    public static void main(String[] args) {
        // 1. First we create the users
        User juan = new User("Juan");
        User brian = new User("Brian");

        // 2. Then we create the devices
        WindowBlind persiana = new WindowBlind(0);
        Light luzSala = new Light();
        MusicSystem estereo = new MusicSystem(10);
        Door puertaPrincipal = new Door();

        // 3. We create the remote control
        RemoteControl control = new RemoteControl();

        // 4. We create the commands
        Command abrirPersiana = new MoveBlindCommand(persiana, 100);
        Command encenderLuz = new TurnOnLightCommand(luzSala);
        Command subirVolumen = new AdjustVolumeCommand(estereo, 50);
        Command abrirPuerta = new OperateDoorCommand(puertaPrincipal, true);

        // 5. Execute actions
        System.out.println("--- Executing Actions ---");
        control.executeCommand(abrirPersiana, juan);
        control.executeCommand(encenderLuz, brian);
        control.executeCommand(subirVolumen, juan);
        control.executeCommand(abrirPuerta, brian);

        // 6. Print initial audit
        System.out.println("\n--- Initial Audit ---");
        control.printSummary();

        // 7. Undo actions
        System.out.println("\n--- Undoing the last 2 actions ---");
        control.undoLast(); // Cierra la puerta
        control.undoLast(); // Baja el volumen a 10

        // 8. Print final audit
        System.out.println("\n--- Final Audit ---");
        control.printSummary();
    }
}