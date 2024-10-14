package programs;

public class EvenAndOddNumberFromAnArray {
    public static void main(String[] args) {

        int a[] = {3, 5, 2, 8, 7, 12};
        int length = a.length;

        for (int i = 0; i < length; i++) {

            if (a[i] % 2 == 0) {
                System.out.println(a[i] + " is Even number");
            } else if (a[i] % 2 != 0) {
                System.out.println(a[i] + " is Odd number");
            }
        }
        /*for (int value : a) {
            if (value % 2 == 0) {
                System.out.println(value + " is Even number");
            } else if (value % 2 != 0) {
                System.out.println(value + " is Odd number");
            }

        }*/
    }
}
