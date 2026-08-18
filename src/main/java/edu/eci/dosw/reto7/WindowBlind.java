package eci.dosw.reto7;

public class WindowBlind {
    private int position;

    public WindowBlind(int startingPosition){
        this.position = startingPosition;
    }

    public void setPosition(int percent){
        if (percent >= 0 && percent <= 100){
            this.position = percent;
        }
    }

    public int getPosition(){
        return this.position;
    }
}
