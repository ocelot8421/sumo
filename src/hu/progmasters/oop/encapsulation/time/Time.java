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
}
