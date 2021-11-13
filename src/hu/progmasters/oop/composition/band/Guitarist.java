package hu.progmasters.oop.composition.band;

public class Guitarist {
    private Guitar myGuitar;

    public Guitarist(Guitar myGuitar) {
        this.myGuitar = myGuitar;
    }

    public void play(){
        myGuitar.makeSound();
    }
}
