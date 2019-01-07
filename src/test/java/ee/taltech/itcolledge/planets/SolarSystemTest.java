package ee.taltech.itcolledge.planets;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolarSystemTest {

    public static final int _149_600_000 = 149600000;

    @Test
    public void asking_for_sun_returns_sun() {
        Sun sun = SolarSystem.getSun();
        assertNotNull(sun);
        assertEquals(5778, (int) sun.getSurfaceTemperatureKelvin());
        // todo assert temperature for Celsius:
        //  Celsius is Kelvin - 273.15
        //  for example: 0K - 273.15 = -273.1*C
    }

    @Test
    public void asking_for_earth_returns_earth() {
        Planet earth = SolarSystem.getEarth();
        assertNotNull(earth);
        assertEquals("Earth", earth.getName());
        assertEquals(_149_600_000, (long) earth.getDistanceFromSun());
    }

    // todo add more tests for other planets


    @Test
    public void you_can_ask_planets_by_their_name() {
        Planet earth = SolarSystem.getPlanet("earth");
        assertNotNull(earth);
        assertEquals("Earth", earth.getName());
        //todo validate you can ask for other planets
    }

    @Test(expected = UnknownPlanetException.class)
    public void unknown_planet_throws_unknown_planet_exception() {
        SolarSystem.getPlanet("unknown");
    }
}