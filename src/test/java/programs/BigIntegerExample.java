package programs;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerExample {

    public static void main(String[] args) {
        String num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first large number: ");
        num1 = sc.nextLine();
        System.out.println("Enter second large number: ");
        num2 = sc.nextLine();
        BigInteger b1 = new BigInteger(num1);
        BigInteger b2 = new BigInteger(num2);
        BigInteger sum;
        sum = b1.add(b2);
        System.out.println("Addition of two large numbers: " + sum);
    }
}
