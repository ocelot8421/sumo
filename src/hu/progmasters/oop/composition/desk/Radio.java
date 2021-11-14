package hu.progmasters.oop.composition.desk;

public class Radio {
    private boolean button;

    public boolean isButton() {
        return button;
    }

    public void setButton(boolean button) {
        this.button = button;
        if (button){
            System.out.println("Radio has been turned on.");
        } else {
            System.out.println("Radio has been turned off.");
        }
    }
}
