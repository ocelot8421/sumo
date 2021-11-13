package hu.progmasters.oop.composition.band;

public class Bassist {
    private Bass myBass;

    public Bassist(Bass myBass) {
        this.myBass = myBass;
    }

    public void play(){
        myBass.makeSound();
    }
}
