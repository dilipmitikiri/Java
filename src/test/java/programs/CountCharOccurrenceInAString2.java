package programs;

import java.util.Scanner;

public class CountCharOccurrenceInAString2 {
    public static void main(String[] args) {

        System.out.print("Enter String: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String p = "";
        char apr = 'e';
        for (int i = 0; i < s.length(); i++) {

            char act = s.charAt(i);
            if (act == apr) {
                p += act;
            }
        }
        System.out.println(p.length());
    }
}
