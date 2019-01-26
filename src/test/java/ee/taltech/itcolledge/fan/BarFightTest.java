package ee.taltech.itcolledge.fan;

import org.junit.Test;

import static org.junit.Assert.*;

public class BarFightTest {

    @Test
    public void groupFansByClub() {
        Fan joe = new Fan("Joe", "ManU");
        Fan victor = new Fan("Victor", "ManU");
        Fan michael = new Fan("Michael", "Chelsea");
        Fan hernandes = new Fan("Hernandes", "Barcelona");
        Object o = BarFight.groupFansByClub(joe, victor, hernandes);
        //todo tests
    }
}