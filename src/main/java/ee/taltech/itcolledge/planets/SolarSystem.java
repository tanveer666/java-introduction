package ee.taltech.itcolledge.planets;

public class SolarSystem {

    public static Sun getSun(){
        return new Sun();
    }

    public static Planet getPlanet(String name){
        if (name.equalsIgnoreCase("Earth")){
            return null;
        } else {
            throw new UnknownPlanetException("Unknown planet: " + name);
        }
    }

    public static Planet getEarth(){
        return null;
    }

    public static Planet getMars(){
        return null;
    }

    public static Planet getVenus(){
        return null;
    }

    public static Planet getMercury(){
        return null;
    }

}
