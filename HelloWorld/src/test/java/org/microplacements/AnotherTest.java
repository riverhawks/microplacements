package org.microplacements;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AnotherTest {

    @Test
    void notTheMeaningOfLife() {
        int expected = 43;

        int actual = Main.getMeaningOfLife();

        assertEquals(expected, actual);
    }
}
