package ee.taltech.itcolledge.cars;

public class Garage {
    //Molecule mole ;
    Molecule mole = new Molecule(); //it works!
    //Car car;
    Car car = new Car(); //so does this!!
  /*
    public Garage()
    {
       mole = new Molecule();
       car = new Car();
    }
*/
    public Molecule getMolecule() {
        return mole;
    }

    public Car getCar() {
        return car;
    }
}
