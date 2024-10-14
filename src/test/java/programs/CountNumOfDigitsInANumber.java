package programs;

import java.util.Scanner;

public class CountNumOfDigitsInANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int noOfDigits = 0;
        while (num > 0) {
            num = num / 10;
            noOfDigits++;
        }
        System.out.println("Number of digits are: " + noOfDigits);

    }
}
