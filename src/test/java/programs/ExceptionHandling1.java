package programs;

public class ExceptionHandling1 {
    public static void main(String[] args) {
        int a = 20, b = 0, result;
        //try catch and finally block
        try {
            result = a / b;
            System.out.println("Result is " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught " + e);
        } finally {
            System.out.println("Finally block will execute always");
        }
        System.out.println("End of the program");
    }
}
