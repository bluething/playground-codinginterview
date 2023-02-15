package io.github.bluething.playground.codinginterview.hackerrank._3monthpreparationkit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

abstract class ParentTest {
    private static final ByteArrayOutputStream output = new ByteArrayOutputStream();
    private static final PrintStream originalOutput = System.out;

    @BeforeAll
    public static void setup() {
        System.setOut(new PrintStream(output));
    }

    @AfterAll
    public static void tearDown() {
        System.setOut(originalOutput);
    }
}
