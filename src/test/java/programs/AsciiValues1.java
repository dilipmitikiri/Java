package programs;

public class AsciiValues1 {
    public static void main(String[] args) {
        //American Standard Code for Information Interchange
        //0- 127(Standard ASCII), 128- 255(Extended ASCII)
        for (int i = 33; i <= 126; i++) {
            //Format specifiers %d is decimal integer, %c is character
            System.out.printf("%d : %c\n", i, i);
        }
    }
}
