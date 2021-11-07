package hu.progmasters.oop.intro.note;

/**
 * Hozz létre egy Note osztályt az alábbi változókkal:
 * - name (String)
 * - topic (String)
 * - text (String)
 * <p>
 * Hozz létre main metódusban egy Note példányt, majd írd ki az abban levő adatokat a konzolra az alábbi formátumban:
 * name : (topic) text
 * <p>
 * Opcionális: hozz létre egy getNoteInfo() metódust a Note osztályban, ami visszaadja mindhárom adatot a fenti
 * formátumban, és használd ezt a metódust a kiírásnál.
 */
public class NoteMain {

    public static void main(String[] args) {

        Note note = new Note();
        note.setName("hahha");
        note.setTopic("vicc");
        note.setText("ez sz*r volt");

        System.out.println(note.getName() + ": (" + note.getTopic() + ") " + note.getText());
        System.out.println(note.getNoteInfo());

    }

}
