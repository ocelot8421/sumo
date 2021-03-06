package hu.progmasters.oop.encapsulation.time;

/**
 * A Time osztály jelképezi egy adott napon belül a pontos időt, 24 órás formátumban (például 18:20:14)
 * <p>
 * 1. Készíts az osztályba három változót:
 * - óra (int)
 * - perc (int)
 * - másodperc (int)
 * <p>
 * 2. Készítsd el az osztály konstruktorát, ami paraméterben várja a fenti változókat.
 * A konstruktorban mindháromnál ellenőrizd, hogy megfelelő értékeket kaptál-e, ha nem, akkor az adott változó értékét
 * állítsd be 0-nak, és írj ki egy hibaüzenetet a konzolra.
 * <p>
 * 3. Készítsd el a változókhoz tartozó getter és setter metódusokat is. A setter metódusokban ellenőrizd a kapott
 * értéket, és ha nem megfelelő, akkor ne változtasd az elmentett értéket, illetve írj ki hibaüzenetet a konzolra.
 * <p>
 * 4. Hozz létre egy TimeMain osztályt, amiben példányosíts különböző paraméterekkel 3 Time típusú objektumot.
 * Ellenőrizd, hogy a változókhoz csak a getter és setter metódusokon keresztül férsz-e hozzá!
 * A main() metódusban írd ki a példányokban elmentett adatokat a konzolra.
 * Állítsd át a setter metódusokkal az objektumokban tárolt adatokat.
 * Írd ki az értékeket újra, hogy ellenőrizd a setter metódusok helyesen működtek-e.
 * <p>
 * 5. A projekt adatbázisfelelőse azt az információt adta, hogy ilyen formátumban nem fogod tudni elmenteni a Time
 * osztályodban tárolt értékeket, ezért alakítsd át az osztályodat!
 * - az osztály egyetlen int változót tartalmazzon, az éjfél óta eltelt másodpercek számát
 * <p>
 * FIGYELEM! Mivel a Time osztályod publikus metódusait már használod a TimeMain osztályban, ezért azok deklarációján
 * nem változtathatsz! Úgy alakítsd át az osztályod, hogy a TimeMain osztályod emiatt ne kelljen módosítani!
 * Mit kell ehhez átírnod a getter és setter metódusok belsejében és a konstruktorban?
 */
public class Time {
    private int hour;
    private int minute;
    private int second;
    private int secondsInt;

    public Time(int secondsInt) {
        this.secondsInt = secondsInt;
    }

    public Time(int hour, int minute, int second) {
        this.hour = checking(hour, 24);
        this.minute = checking(minute, 60);
        this.second = checking(second, 60);
    }

    private int checking(int input, int limit) {
        if (input < 0 || input > limit) {
            System.out.println("Warning: " + input + " is invalid format. It has changed to zero.");
            input = 0;
        }
        return input;
    }

    public void testPrint() {
        System.out.println(this.hour + ":" + this.minute + ":" + this.second);
    }

    public void setHour(int hour) {
        if (hour < 0 || hour > 23) {
            System.out.println("Invalid format.");
        } else {
            this.hour = hour;
        }
    }

    public void setMinute(int minute) {
        if (minute < 0 || minute > 59) {
            System.out.println("Invalid format.");
        } else {
            this.minute = minute;
        }
    }

    public void setSecond(int second) {
        if (second < 0 || second > 59) {
            System.out.println("Invalid format.");
        } else {
            this.second = second;
        }
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }
}
