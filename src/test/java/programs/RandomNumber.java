package programs;

import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {

        //Using Random class
        Random rad = new Random();
        int random_int = rad.nextInt(100);
        System.out.println("Random integer " + random_int);

        double random_decimal1 = rad.nextDouble();   //Range 0.0 to 1.0
        System.out.println("Random decimal " + random_decimal1);

        //Using Math class
        double random_decimal2 = Math.random();
        System.out.println("Random decimal " + random_decimal2);
    }
}
