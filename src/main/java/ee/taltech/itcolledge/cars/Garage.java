package ee.taltech.itcolledge.cars;

public class Garage {

    private Molecule molecule;
    private Car car;

    public Garage() {
        molecule = new Molecule();
        car = new Car();
    }

    public Molecule getMolecule() {
        return molecule;
    }

    public void setMolecule(Molecule molecule) {
        this.molecule = molecule;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
