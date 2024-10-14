package programs;

public class SwappingOfTwoNumbers {
    public static void main(String[] args) {

        int a = 93;
        int b = 67;
        //Using temporary variable
        int temp;
        temp = a;
        a = b;
        b = temp;

        //Using '+' , '-'
        /*a = a + b;
        b = a - b;
        a = a - b;*/

        //Using '*' , '/'
        /*a = a * b;
        b = a / b;
        a = a / b;*/

        //Using single statement
        //b = a + b - (a = b);
        System.out.println("After Swapping values are: a= " + a + ", b= " + b);

    }
}
