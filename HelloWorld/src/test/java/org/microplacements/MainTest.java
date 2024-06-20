package org.microplacements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    void meaningOfLife() {
        int expected = 42;

        int actual = Main.getMeaningOfLife();

        assertEquals(expected, actual);
    }
}
