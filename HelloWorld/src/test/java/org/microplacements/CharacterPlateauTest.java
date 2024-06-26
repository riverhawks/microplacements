package org.microplacements;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CharacterPlateauTest {
    
    @Test
    void testPlateauIsEmpty() {
        CharacterPlateau charPlateau = new CharacterPlateau();
        String testWord = "";
        int expected = 0;
        int actual = charPlateau.characterPlateauCounter(testWord);
        assertEquals(expected, actual);
    }
    
    @Test
    void testPlateauIsOne() {
        CharacterPlateau charPlateau = new CharacterPlateau();
        String testWord = "a";
        int expected = 1;
        int actual = charPlateau.characterPlateauCounter(testWord);
        assertEquals(expected, actual);
    }
    
    @Test
    void testPlateauIsFive() {
        CharacterPlateau charPlateau = new CharacterPlateau();
        String testWord = "aaaaeeeeenwen";
        int expected = 5;
        int actual = charPlateau.characterPlateauCounter(testWord);
        assertEquals(expected, actual);
    }
    
    @Test
    void testPlateauIsTen() {
        CharacterPlateau charPlateau = new CharacterPlateau();
        String testWord = "zzzzzzzzzz";
        int expected = 10;
        int actual = charPlateau.characterPlateauCounter(testWord);
        assertEquals(expected, actual);
    }
    
    @Test
    void testPlateauIsNumbers() {
        CharacterPlateau charPlateau = new CharacterPlateau();
        String testWord = "122333";
        int expected = 3;
        int actual = charPlateau.characterPlateauCounter(testWord);
        assertEquals(expected, actual);
    }
}
