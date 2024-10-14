package programs;

public class MaximumAndMinimumElementsInAnArray {
    public static void main(String[] args) {

        int a[] = {50, 30, 20, 40, 90, 80};
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("Maximum number is " + max);
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("Minimum number is " + min);
    }
}
