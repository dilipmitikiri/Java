package programs;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String value: ");
        String name = sc.next();
        String originalString = name;
        String rev = "";
        int length = name.length();

        for (int i = length - 1; i >= 0; i--) {

            rev = rev + name.charAt(i);
        }
        if (originalString.equals(rev)) {
            System.out.println(rev + " is a Palindrome String");
        } else {
            System.out.println(rev + " is not a Palindrome String");
        }
    }
}
