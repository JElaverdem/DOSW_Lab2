package edu.eci.dosw.reto7;

public class AdjustVolumeCommand implements Command{
    private MusicSystem musicSystem;
    private int newVolume;
    private int previousVolume;
    public AdjustVolumeCommand(MusicSystem musicSystem, int volume){
        this.musicSystem=musicSystem;
        previousVolume=(this.musicSystem.getVolume());
        newVolume=volume;
    }
    @Override
    public void execute(){
        previousVolume=(this.musicSystem.getVolume());
        musicSystem.setVolume(newVolume);
    }
    @Override
    public void undo(){
        musicSystem.setVolume(previousVolume);
        previousVolume=newVolume;
        newVolume=musicSystem.getVolume();
    }
}
