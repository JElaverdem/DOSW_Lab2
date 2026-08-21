package eci.dosw.reto7;

public class AdjustVolumeCommand implements Command{
	private final MusicSystem musicSystem;
	private final int newVolume;
	private int previousVolume;

	public AdjustVolumeCommand(MusicSystem musicSystem, int newVolume) {
		this.musicSystem = musicSystem;
		this.newVolume = newVolume;
	}

	@Override
	public void execute() {
		previousVolume = musicSystem.getVolume();
		musicSystem.setVolume(newVolume);
		System.out.println("The volume is now " + newVolume + ".");
	}

	@Override
	public void undo() {
		musicSystem.setVolume(previousVolume);
		System.out.println("The volume returned to " + previousVolume + ".");
	}
}
