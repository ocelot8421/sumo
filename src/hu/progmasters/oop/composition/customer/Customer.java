package hu.progmasters.oop.composition.customer;

public class Customer {
    private long id;
    private String name;
    private Address address;
    private String phoneNumber;
    private String emailAddress;

    public Customer(long id, String name, String town, String street, int number, String phoneNumber, String emailAddress) {
        this.id = id;
        this.name = name;
        this.address = new Address(town, street, number);
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Customer: \n" +
                "  id: " + id + '\n' +
                "  name: " + name + '\n' +
                "  address: " + "\n" +
                address + '\n' +
                "  phoneNumber: " + phoneNumber + '\n' +
                "  emailAddress: " + emailAddress;
    }
}
