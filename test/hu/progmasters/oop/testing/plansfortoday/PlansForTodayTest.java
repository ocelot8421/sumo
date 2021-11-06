package hu.progmasters.oop.testing.plansfortoday;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Írd meg az alábbi tesztek alapján a PlansForToday osztály planningMyDay metódusát!(Bővíteni szabad!)
 * Hint (Segítség): Használj switch vagy else if szerkezetet
 */

class PlansForTodayTest {

    @Test
    void planningSunnyDayTest() {
        PlansForToday plansForToday = new PlansForToday();
        String actual = plansForToday.planningMyDay("sunny");
        Assertions.assertEquals("Let's go for a walk!", actual);
    }

    @Test
    void planningRainyDayTest() {
        PlansForToday plansForToday = new PlansForToday();
        String actual = plansForToday.planningMyDay("rainy");
        Assertions.assertEquals("Watch a good movie!", actual);
    }

    @Test
    void planningDefaultDayTest() {
        PlansForToday plansForToday = new PlansForToday();
        String actual = plansForToday.planningMyDay("anything");
        Assertions.assertEquals("Write some code!", actual);
    }
}
