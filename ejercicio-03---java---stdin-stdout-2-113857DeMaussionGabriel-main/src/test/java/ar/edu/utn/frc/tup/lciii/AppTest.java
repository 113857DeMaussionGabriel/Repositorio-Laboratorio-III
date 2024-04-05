package ar.edu.utn.frc.tup.lciii;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.InputMismatchException;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    private final InputStream systemIn = System.in;
    private final PrintStream systemOut = System.out;

    private ByteArrayInputStream testIn;
    private ByteArrayOutputStream testOut;

    @BeforeEach
    public void setUpOutput() {
        testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));
    }

    @AfterEach
    public void restoreSystemInputOutput() {
        System.setIn(systemIn);
        System.setOut(systemOut);
    }

    @Test
    public void testCase1() {
        final String testString = "42" + System.lineSeparator() +
                "3,1415" + System.lineSeparator() +
                "Welcome to Java Standar I/O Execise!" + System.lineSeparator();
        provideInput(testString);
        App.main(new String[0]);
        assertEquals("String: Welcome to Java Standar I/O Execise!" + System.lineSeparator() +
                "Double: 3.1415" + System.lineSeparator() +
                "Int: 42" + System.lineSeparator(), getOutput());
    }

    @Test
    public void testCase2() {
        final String testString = "100" + System.lineSeparator() +
                "42" + System.lineSeparator() +
                "42 is the answer to life, the universe, and everything!" + System.lineSeparator();
        provideInput(testString);
        App.main(new String[0]);
        assertEquals("String: 42 is the answer to life, the universe, and everything!" + System.lineSeparator() +
                "Double: 42.0" + System.lineSeparator() +
                "Int: 100" + System.lineSeparator(), getOutput());
    }

    @Test
    public void testCase3() {
        final String testString = "100" + System.lineSeparator() +
                "42" + System.lineSeparator() +
                " 42 is the answer to life, the universe, and everything!" + System.lineSeparator();
        provideInput(testString);
        App.main(new String[0]);
        assertEquals("String:  42 is the answer to life, the universe, and everything!" + System.lineSeparator() +
                "Double: 42.0" + System.lineSeparator() +
                "Int: 100" + System.lineSeparator(), getOutput());
    }

    @Test
    public void testCase4() {
        final String testString = "1" + System.lineSeparator() +
                "0" + System.lineSeparator() +
                " " + System.lineSeparator();
        provideInput(testString);
        App.main(new String[0]);
        assertEquals("String:  " + System.lineSeparator() +
                "Double: 0.0" + System.lineSeparator() +
                "Int: 1" + System.lineSeparator(), getOutput());
    }

    @Test
    public void testCase5() {
        final String testString = "abc" + System.lineSeparator() +
                "dfg" + System.lineSeparator() +
                "hij" + System.lineSeparator();
        provideInput(testString);
        assertThrows(InputMismatchException.class, () ->
            App.main(new String[0]));
    }

    @Test
    public void testCase6() {
        final String testString = "10000000000000000000" + System.lineSeparator() +
                "0" + System.lineSeparator() +
                "-10000000000" + System.lineSeparator();
        provideInput(testString);
        assertThrows(InputMismatchException.class, () ->
                App.main(new String[0]));
    }

    private void provideInput(String data) {
        testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
    }

    private String getOutput() {
        return testOut.toString();
    }
}
