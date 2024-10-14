package programs;

public class SumOfArray {
    public static void main(String[] args) {

        int a[] = {5, 7, 9, 4, 5};
        int sum = 0;
        int length = a.length;

        //Using For loop
        for (int i = 0; i < length; i++) {

            sum = sum + a[i];

        }
        //Using Foreach loop
        /*for (int value : a) {
            sum = sum + value;
        }*/
        System.out.println("Sum of array is " + sum);
    }
}
