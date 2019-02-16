package ee.taltech.itcolledge.strings;

import ee.taltech.itcolledge.strings.StringMaker;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringMakerTest {

    //todo 2 make tests work

    @Test
    public void xStrings() {
        assertEquals("", StringMaker.xString(":)", 0));
        assertEquals("", StringMaker.xString(":P", -5));

        assertEquals("---", StringMaker.xString("-", 3));
        assertEquals("------", StringMaker.xString("--", 3));
        assertEquals(":D:D", StringMaker.xString(":D", 2));

        assertEquals("            ", StringMaker.xString(" ", 12));
    }

    @Test
    public void xyStrings() {
        assertEquals("", StringMaker.xString("-", 0, "x", 0));
        assertEquals("--", StringMaker.xString("-", 2, "x", 0));
        assertEquals("--", StringMaker.xString("-", 2, "x", -2));
        assertEquals("xx", StringMaker.xString("-", 0, "x", 2));
        assertEquals("xx", StringMaker.xString("-", -2, "x", 2));
        assertEquals("--xx", StringMaker.xString("-", 2, "x", 2));
        assertEquals(":P:P:):)", StringMaker.xString(":P", 2, ":)", 2));
    }
}