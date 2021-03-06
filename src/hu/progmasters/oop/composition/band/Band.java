package hu.progmasters.oop.composition.band;

/**
 * Hozz létre egy zenekart a következőképpen:
 * <p>
 * Hozz létre egy-egy osztályt a hangszereknek: Drum, Bass, Guitar, Keyboard.
 * Minden hangszernek van egy makeSound() metódusa, amely kiír a képernyőre egy a hangszerre
 * jellemző hangutánzó szót (szabadon választható).
 * <p>
 * Hozz létre egy-egy osztályt a zenészeknek: Drummer, Bassist, Guitarist, Keyboardist.
 * Minden zenész rendelkezik megfelelő hangszerrel és egy play() metódussal, ami a hangszer
 * makeSound() metódusát hívja meg. A zenész konstruktor paraméteren keresztül kapja meg a hangszerét.
 * <p>
 * A zenekar (Band, használd ezt az osztályt) egy dobosból, egy basszistából, egy gitárosból és egy billentyűsből áll.
 * Van egy playSong() metódusa, ami meghívja az összes zenész play() metódusát.
 * A zenekar konstruktor paraméteren keresztül kapja meg a zenészeit.
 * <p>
 * Hozz létre, egy BandMain classt, ahol példányosítasz egy Band-et, és meghívod a playSong() metódusát.
 */
public class Band {
    private Drummer drummer;
    private Bassist bassist;
    private Guitarist guitarist;
    private Keyboardist keyboardist;

    public Band(Drummer drummer, Bassist bassist, Guitarist guitarist, Keyboardist keyboardist) {
        this.drummer = drummer;
        this.bassist = bassist;
        this.guitarist = guitarist;
        this.keyboardist = keyboardist;
    }

    public void playSong() {
        drummer.play();
        bassist.play();
        guitarist.play();
        keyboardist.play();
    }
}
