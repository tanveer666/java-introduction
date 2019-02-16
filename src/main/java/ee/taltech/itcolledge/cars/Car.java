package ee.taltech.itcolledge.cars;

public class Car {

    private Molecule molecule;
    private Engine engine;

    public Car() {
        molecule = new Molecule();
        engine = new Engine();
    }

    public Molecule getMolecule() {
        return molecule;
    }

    public void setMolecule(Molecule molecule) {
        this.molecule = molecule;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
