package ee.taltech.itcolledge.cars;

public class Gasoline {

    private Molecule molecule;

    public Gasoline() {
        molecule = new Molecule();
    }

    public Molecule getMolecule() {
        return molecule;
    }

    public void setMolecule(Molecule molecule) {
        this.molecule = molecule;
    }
}
