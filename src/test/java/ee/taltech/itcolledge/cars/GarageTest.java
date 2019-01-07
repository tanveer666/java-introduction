package ee.taltech.itcolledge.cars;

import org.junit.Test;

import static org.junit.Assert.*;

public class GarageTest {

    @Test
    public void garage_contains_molecules() {
        assertNotNull(new Garage().getMolecule());
        assertNotNull(new Garage().getCar().getMolecule());
        assertNotNull(new Garage().getCar().getEngine().getMolecule());
        assertNotNull(new Garage().getCar().getEngine().getGasoline().getMolecule());
    }

    @Test
    public void when_you_add_5_1L_of_gasoline_to_gasTank_it_has_5_1L_of_gas() {
        GasTank gasTank = new GasTank();
        gasTank.addGas(5.1);
        assertEquals(5.1, gasTank.getGasoline(), 0.1);
    }

    @Test
    public void when_you_consume_3L_of_5L_gas_it_has_2L_left() {
        GasTank gasTank = new GasTank();
        gasTank.addGas(5);
        gasTank.consumeGas(2);
        assertEquals(3, gasTank.getGasoline(), 0.1);
    }
}