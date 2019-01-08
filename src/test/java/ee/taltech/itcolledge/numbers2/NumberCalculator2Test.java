package ee.taltech.itcolledge.numbers2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberCalculator2Test {

    @Test
    public void sum_is_a_sum_of_3_numbers() {
        assertEquals(0, NumberCalculator2.sum(0, 0, 0));
        //todo add more tests
    }

    @Test
    public void sum_is_a_sum_of_4_numbers() {
        assertEquals(0, NumberCalculator2.sum(0, 0, 0, 0));
        //todo add more tests
    }


    @Test
    public void sum_is_a_sum_of_many_numbers() {
        //assertEquals(0, NumberCalculator2.sum(0, 0, 0, 0, 0, 0, 0, 0));
        //todo add more tests
    }
}
