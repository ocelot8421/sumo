package hu.progmasters.oop.composition.band;

public class Keyboardist {
    private Keyboard myKeyboard;

    public Keyboardist(Keyboard myKeyboard) {
        this.myKeyboard = myKeyboard;
    }

    public void play(){
       myKeyboard.makeSound();
    }
}
