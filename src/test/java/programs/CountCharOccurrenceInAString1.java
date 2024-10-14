package programs;

public class CountCharOccurrenceInAString1 {
    public static void main(String[] args) {

        String s = "Selenium Automation tool";
        int length1 = s.length();
        System.out.println(length1);
        int length2 = s.replace("o", "").length();
        System.out.println(length2);
        System.out.println("Character 'o' appears " + (length1 - length2) + " times");
    }
}