package programs;

public class SearchingAndElementInAnArrayLinearSearch {
    public static void main(String[] args) {

        boolean flag = false;
        int a[] = {23, 45, 92, 30, 84};
        int search_ele = 92;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == search_ele) {
                System.out.println("Element found at index " + i);
                flag = true;
                break;
            }
        }
        if (flag == false) {
            System.out.println("Element not found");
        }
    }
}
