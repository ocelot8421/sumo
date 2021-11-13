package hu.progmasters.oop.composition.sumo;

public class Ring {
    private Wrestler wrestlerLeft;
    private Wrestler wrestlerRight;

    public Ring(Wrestler wrestlerLeft, Wrestler wrestlerRight) {
        this.wrestlerLeft = wrestlerLeft;
        this.wrestlerRight = wrestlerRight;
    }

    public void playHard() {
        int subWeight = wrestlerLeft.getWeight() - wrestlerRight.getWeight();
        int step = subWeight / Math.abs(subWeight);
        for (int i = 0; i < 11; i++) {
            leftDetails();
            lines00();
            for (int j = 0; j < 9 + i * step; j++) {
                System.out.print("_");
            }
                System.out.print("00");
            for (int j = 0; j < 9 - i * step; j++) {
                System.out.print("_");
            }
            rightDetails();
            System.out.println();
        }
        lastLineAboutWinner();
    }

    private void leftDetails() {
        System.out.print(wrestlerLeft.getName() + " " + wrestlerLeft.getWeight() + " ");
    }

    private void rightDetails() {
        System.out.print(" " + wrestlerRight.getWeight() + " " + wrestlerRight.getName());
    }

    private void lastLineAboutWinner() {
        if (weightCheckEquals()) {
            System.out.println("Draw.");
        } else if (weightCheckRedBigger()) {
            System.out.println(wrestlerLeft.getName() + " wins!");
        } else {
            System.out.println(wrestlerRight.getName() + " wins!");
        }
    }

    private boolean weightCheckEquals() {
        return wrestlerLeft.getWeight() == wrestlerRight.getWeight();
    }

    private boolean weightCheckRedBigger() {
        return wrestlerLeft.getWeight() > wrestlerRight.getWeight();
    }

    private void lines00() {

    }

}
