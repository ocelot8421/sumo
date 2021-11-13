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
        int step = subWeight != 0 ? subWeight / Math.abs(subWeight) : 0;
        for (int i = 0; i < 11; i++) {
            leftDetails();
            String line00 = lines00();
            String line00changed = line00.substring(10 - step * i, 30 - step * i);
            System.out.print(line00changed);
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

    private String lines00() {
        return "___________________O0___________________";
    }

}
