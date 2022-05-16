package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest extends SystemOverride {

    @Test
    public void fibonacciIsGeneratedFromInput() {
        sendInput("10");
        App.main(null);

        assertEquals("Enter a size: 0 1 1 2 3 5 8 13 21 34 \n0 1 1 2 3 5 8 13 21 34 \n0 1 1 2 3 5 8 13 21 34\n", outStream.toString());
    }

}