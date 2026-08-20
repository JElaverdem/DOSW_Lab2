package eci.dosw.reto7;

import eci.dosw.reto7.MusicSystem;

public class AdjustVolumeCommand implements Command{
    private MusicSystem musicSystem;
    private int newVolume;
    private int previousVolume;
    public AdjustVolumeCommand(MusicSystem musicSystem, int volume){
        this.musicSystem=musicSystem;
        previousVolume=(this.musicSystem.getVolume());
        newVolume=volume;
    }
    public void execute(){
        previousVolume=(this.musicSystem.getVolume());
        musicSystem.setVolume(newVolume);
    }
    public void undo(){
        musicSystem.setVolume(previousVolume);
        previousVolume=newVolume;
        newVolume=musicSystem.getVolume();
    }
}
