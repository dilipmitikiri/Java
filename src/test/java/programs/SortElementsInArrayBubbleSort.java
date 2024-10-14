package programs;

import java.util.Arrays;

public class SortElementsInArrayBubbleSort {
    public static void main(String[] args) {
        int a[] = {70, 50, 90, 30, 60, 40, 20, 80, 10};
        System.out.println("Before sorting " + Arrays.toString(a));
        int length = a.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println("After sorting: " + Arrays.toString(a));
    }
}
