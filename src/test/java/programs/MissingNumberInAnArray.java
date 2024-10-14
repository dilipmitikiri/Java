package programs;

public class MissingNumberInAnArray {
    public static void main(String[] args) {

        //Array should not have duplicates
        //Value should be in range
        int a[] = {1, 6, 3, 4, 2, 7};
        int length = a.length;
        int sum1 = 0;
        for (int i = 0; i < length; i++) {
            sum1 = sum1 + a[i];
        }
        int sum2 = 0;
        for (int i = 1; i <= 7; i++) {
            sum2 = sum2 + i;
        }
        System.out.println("Missing number is " + (sum2 - sum1));

    }
}
