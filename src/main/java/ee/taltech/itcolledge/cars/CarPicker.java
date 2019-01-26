package ee.taltech.itcolledge.cars;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CarPicker {

    public static void main(String[] args) {
        //todo simulate picking a car


        List<Car> garage = Arrays.asList(
                buildCar("Lamborgini Avendator", 2000000, false, 10.0),
                buildCar("Tesla Roadster", 100000, true, 9.0),
                buildCar("Toyota Prius", 20000, false, 5.0),
                buildCar("Lada", 5000, false, 2.0),
                buildCar("Bicicle", 100, false, 0.5)
        );
        System.out.println(garage);
        //todo what does garage print?

        //todo Ask user how much money do they have and pick them a car or cars based on cars you have in garage
        Scanner scanner = new Scanner(System.in);
        //System.out.println("How much money do you have?");
        //String input = scanner.nextLine();
        //System.out.println("Your input: " + input);


        //todo harder
        // ask user many questions (+electric, +rating)


    }

    private static Car buildCar(String name, int cost, boolean electric, double userRating) {
        Car car = new Car();
        car.setModel(name);
        car.setCost(cost);
        car.setElectric(electric);
        car.setUserRating(userRating);
        return car;
    }
}
