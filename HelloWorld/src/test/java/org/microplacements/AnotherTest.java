package org.microplacements;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AnotherTest {

    @Test
    void meaningOfLife() {
        int expected = 42;

        int actual = Main.getMeaningOfLife();

        assertEquals(expected, actual);
    }
}
