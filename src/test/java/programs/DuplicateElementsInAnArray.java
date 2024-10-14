package programs;

import java.util.HashSet;

public class DuplicateElementsInAnArray {
    public static void main(String[] args) {
        String a[] = {"Java", "Selenium", "C", "C++", "Python", "Dotnet", "Selenium"};
        boolean flag = false;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    System.out.println("Duplicate element is " + a[i]);
                    flag = true;
                }
            }
        }
        if (flag == false) {
            System.out.println("No duplicate elements found");
        }
        //Using HashSet
        /*HashSet<String> hs = new HashSet<String>();
        boolean flag = false;
        for (String ele : a) {
            if (hs.add(ele) == false) {
                System.out.println("Duplicate element is " + ele);
                flag = true;
            }
        }
        if (flag == false) {
            System.out.println("No duplicate elements found");
        }*/
    }
}
