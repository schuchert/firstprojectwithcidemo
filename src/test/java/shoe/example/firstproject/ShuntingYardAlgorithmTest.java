package shoe.example.firstproject;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ShuntingYardAlgorithmTest {
    private ShuntingYardAlgorithm shuntingYardAlgorithm;

    @Before
    public void init() {
        shuntingYardAlgorithm = new ShuntingYardAlgorithm();
    }

    @Test
    public void shouldHandleNull() {
        String result = shuntingYardAlgorithm.translate(null);
        assertThat(result, is(""));
    }

    @Test
    public void shouldHandleEmptyString() {
        String result = shuntingYardAlgorithm.translate("");
        assertThat(result, is(""));
    }

    @Test
    public void shouldReturnNumberUnchanged() {
        String result = shuntingYardAlgorithm.translate("45");
        assertThat(result, is("45"));
    }

    @Test(expected=RuntimeException.class)
    public void shouldRejectOperatorOnly() {
        shuntingYardAlgorithm.translate("+");
    }
}
