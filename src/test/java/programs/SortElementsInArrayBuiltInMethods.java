package programs;

import java.util.Arrays;
import java.util.Collections;

public class SortElementsInArrayBuiltInMethods {
    public static void main(String[] args) {
        int a[] = {70, 50, 90, 30, 60, 40, 20, 80, 10};
        System.out.println("Before sorting " + Arrays.toString(a));
        //Method 1
        Arrays.parallelSort(a);
        System.out.println("After sorting " + Arrays.toString(a));

        //Method 2
        /*Arrays.sort(a);
        System.out.println("After sorting " + Arrays.toString(a));*/

        //Reverse sorting
        Integer b[] = {70, 50, 90, 30, 60, 40, 20, 80, 10};
        Arrays.sort(b, Collections.reverseOrder());
        System.out.println("Reverse sorting " + Arrays.toString(b));
    }
}
