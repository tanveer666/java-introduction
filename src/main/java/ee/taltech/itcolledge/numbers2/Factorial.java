package ee.taltech.itcolledge.numbers2;

public class Factorial {

    public static long factorial(int n) {
        //todo rewrite with if and else methods
        return (1 > n) ? 1 : n * factorial(n - 1);
    }

    public static void main(String[] args) {
        //todo loop over factorials
        // what happens on factorial 21?
        // can you improve this function?
    }
}
