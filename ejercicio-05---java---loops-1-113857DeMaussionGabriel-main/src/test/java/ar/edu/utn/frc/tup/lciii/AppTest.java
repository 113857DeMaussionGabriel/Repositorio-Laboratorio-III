package ar.edu.utn.frc.tup.lciii;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

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
        final String testString = "2" + System.lineSeparator();
        provideInput(testString);
        App.main(new String[0]);
        assertEquals("2 x 1 = 2" + System.lineSeparator() +
                "2 x 2 = 4" + System.lineSeparator() +
                "2 x 3 = 6" + System.lineSeparator() +
                "2 x 4 = 8" + System.lineSeparator() +
                "2 x 5 = 10" + System.lineSeparator() +
                "2 x 6 = 12" + System.lineSeparator() +
                "2 x 7 = 14" + System.lineSeparator() +
                "2 x 8 = 16" + System.lineSeparator() +
                "2 x 9 = 18" + System.lineSeparator() +
                "2 x 10 = 20" + System.lineSeparator(), getOutput());
    }

    @Test
    public void testCase2() {
        final String testString = "5" + System.lineSeparator();
        provideInput(testString);
        App.main(new String[0]);
        assertEquals("5 x 1 = 5" + System.lineSeparator() +
                "5 x 2 = 10" + System.lineSeparator() +
                "5 x 3 = 15" + System.lineSeparator() +
                "5 x 4 = 20" + System.lineSeparator() +
                "5 x 5 = 25" + System.lineSeparator() +
                "5 x 6 = 30" + System.lineSeparator() +
                "5 x 7 = 35" + System.lineSeparator() +
                "5 x 8 = 40" + System.lineSeparator() +
                "5 x 9 = 45" + System.lineSeparator() +
                "5 x 10 = 50" + System.lineSeparator(), getOutput());
    }

    @Test
    public void testCase3() {
        final String testString = "20" + System.lineSeparator();
        provideInput(testString);
        App.main(new String[0]);
        assertEquals("20 x 1 = 20" + System.lineSeparator() +
                "20 x 2 = 40" + System.lineSeparator() +
                "20 x 3 = 60" + System.lineSeparator() +
                "20 x 4 = 80" + System.lineSeparator() +
                "20 x 5 = 100" + System.lineSeparator() +
                "20 x 6 = 120" + System.lineSeparator() +
                "20 x 7 = 140" + System.lineSeparator() +
                "20 x 8 = 160" + System.lineSeparator() +
                "20 x 9 = 180" + System.lineSeparator() +
                "20 x 10 = 200" + System.lineSeparator(), getOutput());
    }

    private void provideInput(String data) {
        testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
    }

    private String getOutput() {
        return testOut.toString();
    }
}
