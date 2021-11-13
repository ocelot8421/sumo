package hu.progmasters.oop.composition.band;

public class BandMain {
    public static void main(String[] args) {
        Band bandCool = new Band(
                new Drummer(new Drum()),
                new Bassist(new Bass()),
                new Guitarist(new Guitar()),
                new Keyboardist(new Keyboard()));
        bandCool.playSong();
    }
}
