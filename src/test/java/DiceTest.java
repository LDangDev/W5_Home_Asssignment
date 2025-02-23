import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

class DiceTest {

    @Test
    void roll() {
        Dice dice = new Dice();
        dice.roll();
        assertTrue(dice.isDouble(), "Dice should roll until a double is achieved");
    }

    @Test
    void isDouble() {
        Dice dice = new Dice();
        dice.roll();
        assertEquals(dice.getDice1(), dice.getDice2(), "Dice values should be equal when isDouble() returns true");
    }

    @Test
    void getDice1() {
        Dice dice = new Dice();
        dice.roll();
        assertTrue(dice.getDice1() >= 1 && dice.getDice1() <= 6, "Dice 1 value should be between 1 and 6");
    }

    @Test
    void getDice2() {
        Dice dice = new Dice();
        dice.roll();
        assertTrue(dice.getDice2() >= 1 && dice.getDice2() <= 6, "Dice 2 value should be between 1 and 6");
    }
}