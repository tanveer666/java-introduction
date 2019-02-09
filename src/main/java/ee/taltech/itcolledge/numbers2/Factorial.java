package ee.taltech.itcolledge.numbers2;

public class Factorial {

    public static long factorial(int n) {
        //todo rewrite with tertiary if statement (using ? and :) (colon, not a smiley)
        if (1 > n) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        //todo call factorial function with inputs 0, 2, 5, 10, 15, 20
        // what happens on factorial 21?
    }
}
