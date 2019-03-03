package ee.taltech.itcolledge.cars;

public class GasTank {

    private Double gasoline;


    public void addGas(double l) {
        gasoline = l;
    }

    public void consumeGas(double i) {
        gasoline -= i;
    }

    public Double getGasoline() {
        return gasoline;
    }
}
