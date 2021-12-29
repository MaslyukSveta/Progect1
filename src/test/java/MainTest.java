import Task5.Worker5;
import org.apache.commons.io.IOUtils;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;


class MainTest {


    private ByteArrayOutputStream output = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(output));
    }

    @Test
    public void testString() throws Exception {

        ByteArrayInputStream userInput = new ByteArrayInputStream("1\n1\n1\n".getBytes());
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setIn(userInput);
        System.setOut(new PrintStream(outputStreamCaptor));


        Main main = new Main();
        main.task1();

        assertEquals("Введите число \r\n" + "Введите число 2\n", outputStreamCaptor.toString().trim());



    }




    @Test
    public void testString1() throws Exception {


        Main main = new Main();

        String input = "5";

        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);


        main.task1();
        Assert.assertEquals("Введите число 1", output.toString());

        Assert.assertEquals("5", output.toString());


        Assert.assertEquals("Введите число 2", output.toString());


    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }


    @Test
    void main()throws IOException {


    }

    @Test
    void task1() {


    }

    @Test
    void task2() {
    }

    @Test
    void task3() {
    }

    @Test
    void taskMenu() {



    }

    @Test
    void task5() {
    }



    @Test
    public void userInputTest() {

    }
}