package edu.eci.dosw.reto7;

public class MusicSystem {
    private int volume;

    public MusicSystem(int initialVolume){
        this.volume = initialVolume;
    }

    public void setVolume(int newVolume){
        this.volume = newVolume;
    }

    public int getVolume(){
        return this.volume;
    }
}
