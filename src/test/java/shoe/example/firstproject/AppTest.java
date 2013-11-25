package shoe.example.firstproject;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class AppTest {
    private ByteArrayOutputStream byteArrayOutputStream;
    private PrintStream originalSystemOut;

    @Before
    public void redirectOutput() {
        byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArrayOutputStream);
        originalSystemOut = System.out;
        System.setOut(printStream);
    }

    @After
    public void restoreOutput() {
        System.setOut(originalSystemOut);
    }

    @Test
    public void testApp() {
        App.main(null);
        assertThat(byteArrayOutputStream.toString(), is("Hello World!\n"));
    }
}
