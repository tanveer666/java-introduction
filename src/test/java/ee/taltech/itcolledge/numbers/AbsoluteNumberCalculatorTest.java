package ee.taltech.itcolledge.numbers;

import org.junit.Test;

import static org.junit.Assert.*;

public class AbsoluteNumberCalculatorTest {

    @Test
    public void absolute_number_calculator_takes_the_sum_of_absolute_numbers() {
        // todo copy most of existing tests here as they should work
        assertEquals(10, AbsoluteNumberCalculator.sum(5, -5));

    }
}