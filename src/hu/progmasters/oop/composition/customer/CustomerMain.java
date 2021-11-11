package hu.progmasters.oop.composition.customer;

import java.util.Arrays;

/**
 * Készíts egy Address (lakcím) nevű osztályt, ami a következő attríbútumokat tartalmazza:
 * - town (String) (város)
 * - street (String) (utca)
 * - number (int) ((ház)szám)
 * <p>
 * Customer (vásárló) a következő attríbútumokat tartalmazza:
 * - id (long)
 * - name (String) (név)
 * - address (Address) (lakcím)
 * - phone number (String) (telefonszám)
 * - email address (String)
 * <p>
 * Adj hozzá a Customerhez setCustomerInfo() nevű metódust, ami paraméterként kapja meg az alábbi információkat, és
 * állítsa be ezeket a vásárlóhoz:
 * város, utca, házszám, telefonszám, emailcím
 * <p>
 * A main metódusban hozz létre 2 Customer objektumot és a hozzájuk tartozó Address objektumokat.
 */

public class CustomerMain {

    public static void main(String[] args) {
        Customer peter = new Customer( 6, "Főni","Coruscant", "Pipaxs", 1366,
                "5", "peti@en.hu");

        System.out.println(peter);


    }
}
