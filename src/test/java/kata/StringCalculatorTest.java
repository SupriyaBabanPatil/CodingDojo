package kata;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class StringCalculatorTest {

    private StringCalculator stringCalculator = new StringCalculator();

    @Test
    public void shouldReturnZeroForNullOrEmptyString() {
        verify(null, 0);
        verify("", 0);
    }

    @Test
    public void shouldReturnNumberForSingleInput() {
        verify("1", 1);
        verify("2", 2);
        verify("3", 3);
    }

    @Test
    public void shouldReturnSumOfTwoNumbers() {
        verify("1,2", 3);
    }

    @Test
    public void shouldReturnSumOfMultipleNumbers() {
        verify("1,2,3,4,5", 15);
    }

    private void verify(final String input, final int expected) {
        assertThat(stringCalculator.add(input), CoreMatchers.is(expected));
    }
}
