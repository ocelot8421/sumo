package hu.progmasters.oop.composition.customer;

public class Address {
    private String town;
    private String street;
    private int number;

    public Address(String town, String street, int number) {
        this.town = town;
        this.street = street;
        this.number = number;
    }

     public void setTown(String town) {
        this.town = town;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "    town:" + town + '\n' +
                "    street:" + street + '\n' +
                "    number:" + number;
    }

}
