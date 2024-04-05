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
        final String testString = "3" + System.lineSeparator();
        provideInput(testString);
        App.main(new String[0]);
        assertEquals("Weird" + System.lineSeparator(), getOutput());
    }

    @Test
    public void testCase2() {
        final String testString = "24" + System.lineSeparator();
        provideInput(testString);
        App.main(new String[0]);
        assertEquals("Not Weird" + System.lineSeparator(), getOutput());
    }

    @Test
    public void testCase3() {
        final String testString = "2" + System.lineSeparator();
        provideInput(testString);
        App.main(new String[0]);
        assertEquals("Not Weird" + System.lineSeparator(), getOutput());
    }

    @Test
    public void testCase4() {
        final String testString = "5" + System.lineSeparator();
        provideInput(testString);
        App.main(new String[0]);
        assertEquals("Weird" + System.lineSeparator(), getOutput());
    }

    @Test
    public void testCase5() {
        final String testString = "6" + System.lineSeparator();
        provideInput(testString);
        App.main(new String[0]);
        assertEquals("Weird" + System.lineSeparator(), getOutput());
    }

    @Test
    public void testCase6() {
        final String testString = "20" + System.lineSeparator();
        provideInput(testString);
        App.main(new String[0]);
        assertEquals("Weird" + System.lineSeparator(), getOutput());
    }

    @Test
    public void testCase7() {
        final String testString = "19" + System.lineSeparator();
        provideInput(testString);
        App.main(new String[0]);
        assertEquals("Weird" + System.lineSeparator(), getOutput());
    }

    @Test
    public void testCase8() {
        final String testString = "21" + System.lineSeparator();
        provideInput(testString);
        App.main(new String[0]);
        assertEquals("Weird" + System.lineSeparator(), getOutput());
    }

    @Test
    public void testCase9() {
        final String testString = "1" + System.lineSeparator();
        provideInput(testString);
        App.main(new String[0]);
        assertEquals("Weird" + System.lineSeparator(), getOutput());
    }

    @Test
    public void testCase10() {
        final String testString = "100" + System.lineSeparator();
        provideInput(testString);
        App.main(new String[0]);
        assertEquals("Not Weird" + System.lineSeparator(), getOutput());
    }

    private void provideInput(String data) {
        testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
    }

    private String getOutput() {
        return testOut.toString();
    }
}
