package programs;

public class ConvertIntegerToString {
    public static void main(String[] args) {
        int num = 200;
        String s = String.valueOf(num);
        System.out.println("Before converting to String when added: " + (num + 100));
        System.out.println("After converting to String when added: " + (s + 100));
    }
}
