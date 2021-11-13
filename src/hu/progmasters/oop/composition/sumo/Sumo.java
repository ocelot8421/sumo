package hu.progmasters.oop.composition.sumo;

/**
 * Egy szumó mérkőzést fogunk lemodellezni a következő módon:
 * 1) A ring egy 20 egység hosszúságú egyenes szakasz, melyen oda-vissza tudják egymást lökdösni a birkózók.
 * 2) A birkózók célja, hogy kilökjék az ellenfelüket a ringből
 * (nem cserélnek közben helyet, azon az oldalon maradnak, ahol indultak).
 * 3) Először egy nagyon egyszerű esetet nézünk:
 * - A birkózóknak két tulajdonságuk van, nevük és testtömegük (konstruktoron keresztül beállítva).
 * - A birkózók egymás mellől indulnak, tehát nem kell az ütközésüket figyelni
 * - A meccs kimenetelét csak a testtömeg határozza meg.
 * 4) Az erősebb (tehát itt: nehezebb) birkózó minden körben egy egységgel tudja a ring széle felé lökni ellenfelét.
 * 5) Ha a gyengébb birkózó a ringen kívülre kerül, a meccs véget ér, kihirdetjük a győztest.
 * 6) Megjelenítés
 * - A birkózókat "O" fogja szimbolizálni, a ring "üres" egységeit pedig "_".
 * - Balról jobbra a kiírandó információ:
 * [1. birkózó neve] [1. birkózó tömege] [a ring és a birkózók megjelenítése] [2.birkózó tömege] [2. birkózó neve]
 * 7) Példa arra, hogyan is fog kinézni a végeredmény:
 * Kisuke 110 _________OO_________ 100 Yamada
 * Kisuke 110 __________OO________ 100 Yamada
 * Kisuke 110 ___________OO_______ 100 Yamada
 * Kisuke 110 ____________OO______ 100 Yamada
 * Kisuke 110 _____________OO_____ 100 Yamada
 * Kisuke 110 ______________OO____ 100 Yamada
 * Kisuke 110 _______________OO___ 100 Yamada
 * Kisuke 110 ________________OO__ 100 Yamada
 * Kisuke 110 _________________OO_ 100 Yamada
 * Kisuke 110 __________________OO 100 Yamada
 * Kisuke 110 ___________________O 100 Yamada
 * Kisuke wins!
 * <p>
 * A feladathoz hozz létre egy Wrestler osztályt, ami a szumó birkózók adatait fogja tárolni, és egy Ring osztályt,
 * ami megkapja a két Wrestlert, és ami a logikát tartalmazza.
 */
public class Sumo {
    private Wrestler wrestlerRed;
    private Wrestler wrestlerBlue;

    public Sumo(Wrestler wrestlerRed, Wrestler wrestlerBlue) {
        this.wrestlerRed = wrestlerRed;
        this.wrestlerBlue = wrestlerBlue;
    }

    public void playMatch() {
        if(weightCheckEquals()){
            System.out.println("Draw.");
        } else if (weightCheckRedBigger()){
            System.out.println("The winner is the " + wrestlerRed.getName());
        } else {
            System.out.println("The winner is " + wrestlerBlue.getName());
        }
    }

    private boolean weightCheckEquals() {
        return wrestlerRed.getWeight() == wrestlerBlue.getWeight();
    }

    private boolean weightCheckRedBigger(){
        return wrestlerRed.getWeight() > wrestlerBlue.getWeight();
    }

}
