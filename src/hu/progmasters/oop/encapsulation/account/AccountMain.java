package hu.progmasters.oop.encapsulation.account;

public class AccountMain {

    public static void main(String[] args) {
        Account myAccount = new Account();
        myAccount.deposit(-1000);
        myAccount.deposit(500);
        myAccount.deposit(2000);
        myAccount.withdraw(-1000);
        myAccount.withdraw(2000);
        myAccount.withdraw(1000);
    }
}
