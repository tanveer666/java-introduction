package ee.taltech.itcolledge.cars;

public class Car {
    Molecule mole;
    Engine _2jz;

    public Car()
    {
        mole = new Molecule();
        _2jz = new Engine();
    }

    public Molecule getMolecule() {
        return mole;
    }

    public Engine getEngine() {
        return _2jz;
    }
}
