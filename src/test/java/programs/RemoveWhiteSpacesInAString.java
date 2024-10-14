package programs;

public class RemoveWhiteSpacesInAString {
    public static void main(String[] args) {

        String a = "  Selenium Automation tool ";
        a = a.replaceAll("\\s", "");
        System.out.println(a);
    }
}
