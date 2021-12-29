package Task5;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class Main5Test {

    private ByteArrayOutputStream output = new ByteArrayOutputStream();
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(output));
    }

    @Test
    void main() {
        String input  = "";
        ByteArrayInputStream userInput = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setIn(userInput);
        System.setOut(new PrintStream(outputStreamCaptor));


        Main5 main5 = new Main5();


        assertEquals("Введите число \r\n" + "Введите число 2\n", outputStreamCaptor.toString().trim());



    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }

}