package hu.progmasters.oop.intro.client;

import java.util.Scanner;

/**
 * Hozz létre egy Client osztályt, melynek három attribútuma van:
 * név (name),
 * születési év (year) és
 * cím (address).
 * Típusaik rendre String, int és String. A láthatóságuk legyen publikus.
 * <p>
 * Hozz létre egy main() metódust a ClientMain osztályba, amelyben kipróbálod a Client osztály működését.
 * Példányosítani kell egy objektumot a Client osztály alapján, majd kérd be az attribútumok értékét a felhasználótól.
 * Ellenőrzésképp írd ki minden attribútumának értékét a konzolra!
 */
public class ClientMain {

    public static void main(String[] args) {

        Client babo = new Client();
        Scanner scan = new Scanner(System.in);

        System.out.println("name:");
        babo.name = scan.nextLine();

        System.out.println("year:");
        babo.year = scan.nextInt();
        scan.nextLine();

        System.out.println("adress:");
        babo.address = scan.nextLine();

        System.out.println(babo.name);
        System.out.println(babo.year);
        System.out.println(babo.address);



    }
}
