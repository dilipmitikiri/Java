package programs;

import java.io.IOException;

public class OpenNotePad {
    public static void main(String[] args) {
        Runtime rs = Runtime.getRuntime();
        try {
            rs.exec("notepad");
            rs.exec("control panel");
            System.out.println("Notepad opened");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
