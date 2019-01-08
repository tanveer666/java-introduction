package ee.taltech.itcolledge.groups;

import java.util.Scanner;

public class GroupDivisor {

    public static void main(String[] args) {
        System.out.println("Enter your name: ");
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        System.out.println("You said your name is: " + line);

        // todo using example above create a program to calculate number of groups
        System.out.println("---------=============---------");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("Insert the number of people");
        int people = 0;
        System.out.println("Insert the group size");
        int size = 0;

        //todo create tests for your calculator
        int groups = 0;
        int leftover = 0;

        System.out.println(String.format("You get %d full groups, leftover %d.", groups, leftover));
        System.out.println("---------=============---------");
        System.out.println("\n");
        System.out.println("\n");

        // todo using example above create a program to calculate return on investment ROI
        System.out.println("Insert the initial investment");
        int investment = 0;
        System.out.println("Insert the expected return a year %");
        int percentage = 0;

        System.out.println(String.format("You get %d money back, out of which %d. is pure profit", groups, leftover));
    }
}
