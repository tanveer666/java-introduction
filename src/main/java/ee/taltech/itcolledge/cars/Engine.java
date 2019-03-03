package ee.taltech.itcolledge.cars;

public class Engine {
    Molecule mole = new Molecule();
    Gasoline petrol = new Gasoline();

  /*  public Engine()
    {
        mole = new Molecule();
        petrol = new Gasoline();
    }
*/
    public Molecule getMolecule() {
        return mole;
    }

    public Gasoline getGasoline() {
        return petrol;
    }
}
