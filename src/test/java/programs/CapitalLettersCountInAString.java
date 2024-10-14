package programs;

public class CapitalLettersCountInAString {
    public static void main(String[] args) {
        //Capital letters A- Z(65- 90)
        //Small letters a- z(97- 122)
        String s = "SuNrIsErSHYDerAbaD";
        int smallLetters = 0;
        int capitalLetters = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 65 && ch <= 90) {
                capitalLetters++;
            } else {
                smallLetters++;
            }
        }
        System.out.println("Capital Letters = " + capitalLetters);
        System.out.println("Small Letters = " + smallLetters);
    }
}
