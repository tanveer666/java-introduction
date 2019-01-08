package ee.taltech.itcolledge.numbers;

import org.junit.Test;

import static org.junit.Assert.*;

public class CappedTo100NumberCalculatorTest {


    @Test
    public void sum_is_a_sum_of_2_numbers() {
        assertEquals(0, NumberCalculator.sum(0, 0));
        assertEquals(5, NumberCalculator.sum(5, 0));
        assertEquals(5, NumberCalculator.sum(0, 5));
        assertEquals(10, NumberCalculator.sum(5, 5));

        //todo add test with -5
    }

    @Test
    public void capped_sum_is_either_sum_or_plus_minus_100() {
        assertEquals(0, CappedTo100NumberCalculator.sum(0, 0));
        assertEquals(5, CappedTo100NumberCalculator.sum(5, 0));
        assertEquals(5, CappedTo100NumberCalculator.sum(0, 5));
        assertEquals(10, CappedTo100NumberCalculator.sum(5, 5));

        //todo add test with -5

        assertEquals(100, NumberCalculator.sum(105, 0));
        assertEquals(100, NumberCalculator.sum(0, 105));
        assertEquals(100, NumberCalculator.sum(105, 105));

        //todo add test with -100
    }

}