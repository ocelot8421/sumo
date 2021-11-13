package hu.progmasters.oop.composition.sumo;

public class SumoMain {

    public static void main(String[] args) {
        Sumo grrr = new Sumo(
                new Wrestler("Béla", 200),
                new Wrestler("NemBéla", 201)
        );
        grrr.playMatch();
    }

}
