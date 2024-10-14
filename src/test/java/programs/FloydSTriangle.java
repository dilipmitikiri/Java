package programs;

import java.util.Scanner;

public class FloydSTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows of floyd's triangle you want");
        int n = sc.nextInt();
        int num = 1;
        System.out.println("Floyd's triangle : ");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
