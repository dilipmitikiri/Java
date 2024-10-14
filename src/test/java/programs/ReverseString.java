package programs;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String value: ");
        String name = sc.next();
        String rev = "";
        //Using String concatenation operator
        int length = name.length();

        for (int i = length - 1; i >= 0; i--) {

            rev = rev + name.charAt(i);
        }
        System.out.println("Reverse String is: " + rev);

        //Using String Buffer class
        /*StringBuffer sb = new StringBuffer(name);
        System.out.println(sb.reverse());*/

    }
}
