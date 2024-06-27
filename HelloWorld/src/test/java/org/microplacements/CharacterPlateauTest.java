package org.microplacements;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CharacterPlateauTest {
    
    @Test
    void testPlateauIsEmpty() {
        CharacterPlateau charPlateau = new CharacterPlateau();
        String testWord = "";
        String expected = "";
        String actual = charPlateau.characterPlateauCounter(testWord);
        assertEquals(expected, actual);
    }
    
    @Test
    void testPlateauIsOne() {
        CharacterPlateau charPlateau = new CharacterPlateau();
        String testWord = "a";
        String expected = "a";
        String actual = charPlateau.characterPlateauCounter(testWord);
        assertEquals(expected, actual);
    }
    
    @Test
    void testPlateauIsFive() {
        CharacterPlateau charPlateau = new CharacterPlateau();
        String testWord = "aaaaeeeeenwen";
        String expected = "eeeee";
        String actual = charPlateau.characterPlateauCounter(testWord);
        assertEquals(expected, actual);
       
    }
    
    @Test
    void testPlateauIsTen() {
        CharacterPlateau charPlateau = new CharacterPlateau();
        String testWord = "zzzzzzzzzz";
        String expected = "zzzzzzzzzz";
        String actual = charPlateau.characterPlateauCounter(testWord);
        assertEquals(expected, actual);
    }
    
    @Test
    void testPlateauIsNumbers() {
        CharacterPlateau charPlateau = new CharacterPlateau();
        String testWord = "122333";
        String expected = "333";
        String actual = charPlateau.characterPlateauCounter(testWord);
        assertEquals(expected, actual);
    }
}
