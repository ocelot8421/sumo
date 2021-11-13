package hu.progmasters.oop.composition.sumo;

public class Wrestler {
    private String name;
    private int weight;

    public Wrestler(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }
}
