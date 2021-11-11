package hu.progmasters.oop.encapsulation.account;

/**
 * Az Account osztálynak egy példányváltozója van: balance (egész szám), kezdő értéke 0.
 * <p>
 * Készíts az osztályhoz két metódust:
 * 1. deposit(int amount)
 * - az amount nem lehet 1000-nél kisebb, ilyen esetben kiírja, hogy sikertelen volt a művelet
 * - ha megfelelő az amount, akkor hozzáadja a balance-hoz
 * - majd kiírja az új, megnövelt értékét a konzolra
 * - a metódus nem ad vissza semmilyen értéket
 * <p>
 * 2. withdraw(int amount)
 * - az amount nem lehet 1000-nél kisebb, ilyen esetben kiírja, hogy sikertelen volt a művelet
 * - a bemenetül kapott amount paraméter + 10-et (a felvett összeg plusz kezelési költség) kivon a balance-ból
 * - ha az amount + 10 nagyobb, mint a balance, szintén sikertelen a művelet
 * - majd kiírja az új, csökkentett értéket a konzolra
 * - a metódus nem ad vissza semmilyen értéket
 * <p>
 * Ezután:
 * - hozz létre egy AccountMain osztályt
 * - példányosíts egy Accountot
 * - hívd meg a deposit metódust -1000-rel
 * - hívd meg a deposit metódust 500-zal
 * - hívd meg a deposit metódust 2000-rel
 * - hívd meg a withdraw metódust -1000-rel
 * - hívd meg a withdraw metódust 2000-rel
 * - hívd meg a withdraw metódust 1000-rel
 * <p>
 * Ellenőrizd az AccountMain osztályban, hogy hozzáférsz-e a létrehozott Account balance-ához közvetlenül, vagy csak
 * a deposit és withdraw metódusokon keresztül!
 */
public class Account {
    private int balance = 0;

    public void deposit(int amount) {
        if (amount < 1000) {
            System.out.println("Sikertelen művelet. Egyenlege: " + balance);
        } else {
            balance += amount;
            System.out.println("Feltöltés: " + amount + ". Új egyenlege: " + balance);
        }
    }

    public void withdraw(int amount) {
        int handlingCharge = 10;
        int withdrawGross = amount + handlingCharge;
        if (amount < 1000 || balance < withdrawGross) {
            System.out.println("Sikertelen művelet. Egyenlege: " + balance);
        } else {
            balance -= withdrawGross;
            System.out.println(
                    "Levonás: " + amount + ". Kezelési költség: " + handlingCharge + ". Új egyenlege: " + balance
            );
        }
    }


}
