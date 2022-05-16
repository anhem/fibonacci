package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public abstract class SystemOverride {

    protected final ByteArrayOutputStream outStream = new ByteArrayOutputStream();
    protected final ByteArrayOutputStream errorStream = new ByteArrayOutputStream();
    private final PrintStream defaultOutStream = System.out;
    private final PrintStream defaultErrorStream = System.err;
    private final InputStream defaultIn = System.in;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outStream));
        System.setErr(new PrintStream(errorStream));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(defaultOutStream);
        System.setErr(defaultErrorStream);
        System.setIn(defaultIn);
    }

    protected void sendInput(String input) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

}
