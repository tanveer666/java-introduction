package ee.taltech.itcolledge.cars;

public class Engine {

    private Molecule molecule;
    private Gasoline gasoline;

    public Engine() {
        molecule = new Molecule();
        gasoline = new Gasoline();
    }

    public Molecule getMolecule() {
        return molecule;
    }

    public void setMolecule(Molecule molecule) {
        this.molecule = molecule;
    }

    public Gasoline getGasoline() {
        return gasoline;
    }

    public void setGasoline(Gasoline gasoline) {
        this.gasoline = gasoline;
    }
}
