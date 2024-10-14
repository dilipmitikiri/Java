package programs;

public class RemoveJunkOrSpecialCharactersInString {
    public static void main(String[] args) {
        String s1 = "%^#*(( $#)() Java 12847_*^#%";
        String s2 = "&%#@_)#@$/ Selenium .,][';=||";
        s1 = s1.replaceAll("[^a-zA-Z0-9]", "");
        s2 = s2.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(s1);
        System.out.println(s2);
    }
}
