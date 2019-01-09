package ee.taltech.itcolledge.fizzbuzz;

import ee.taltech.itcolledge.strings.StringMaker;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringMakerTest {

    @Test
    public void xCharacters() {

        assertEquals("", StringMaker.xCharacters('-', 0));
        assertEquals("", StringMaker.xCharacters('a', -5));

        assertEquals("---", StringMaker.xCharacters('-', 3));
        assertEquals("aa", StringMaker.xCharacters('a', 2));

        assertEquals("            ", StringMaker.xCharacters(' ', 12));
    }

    @Test
    public void xyCharacters() {
        // todo add tests
    }

    @Test
    public void xStrings() {
        // todo add tests
    }

    @Test
    public void xyStrings() {
        // todo add tests
    }
}