package programs;

public class ConvertStringToInteger {
    public static void main(String[] args) {
        String s = "200";
        int i = Integer.parseInt(s);
        System.out.println("Before converting to integer when added: " + (s + 100));
        System.out.println("After converting to integer when added: " + (i + 100));
    }
}
