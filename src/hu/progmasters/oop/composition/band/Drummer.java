package hu.progmasters.oop.composition.band;

public class Drummer {
    private Drum myDrum;

    public Drummer(Drum myDrum) {
        this.myDrum = myDrum;
    }

    public void play(){
        myDrum.makeSound();
    }


}
