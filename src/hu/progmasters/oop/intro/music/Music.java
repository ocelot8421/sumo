package hu.progmasters.oop.intro.music;

import java.util.Scanner;

/**
 * Készíts egy Song osztályt, melyben eltárolhatod egy dal előadóját (band),
 * címét (title) és a hosszát (length) percben!
 * <p>
 * Készíts main() metódust a Music osztályba, ahol kérd be a felhasználótól a kedvenc zeneszáma adatait!
 * Ellenőrzésképp írd ki a megadott adatokat előadó - cím (hossz percben) formában,
 * azaz Britney Spears - Oops!...I Did It Again (4 perc)!
 */
public class Music {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Song fav = new Song();

        System.out.println("Band:");
        fav.setBand(scanner.nextLine());
        System.out.println("Title:");
        fav.setTitle(scanner.nextLine());
        System.out.println("Length:");
        fav.setLength(scanner.nextInt());

        System.out.println(fav.getBand() + " - " + fav.getTitle() + " (" + fav.getLength() + " perc)");
    }
}
