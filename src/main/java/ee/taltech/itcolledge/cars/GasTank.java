package ee.taltech.itcolledge.cars;

public class GasTank {

    private Double gasoline;

    public GasTank() {
        gasoline = 0.0;
    }

    public void addGas(double liters) {
        gasoline += liters;
    }

    public void consumeGas(double liters) {
        gasoline -= liters;
    }

    public Double getGasoline() {
        return gasoline;
    }
}
