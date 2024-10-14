package programs;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        int originalNum = num;
        int rev = 0;
        while (num > 0) {

            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        if (originalNum == rev) {
            System.out.println(rev + " is a Palindrome number");
        } else {
            System.out.println(rev + " is not a Palindrome number");
        }
    }
}
