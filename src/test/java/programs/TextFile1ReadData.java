package programs;

import java.io.*;

public class TextFile1ReadData {
    public static void main(String[] args) throws IOException {
        //Using file reader and buffered reader
        FileReader fr = new FileReader("D:\\Dileep\\Software testing\\Softwares\\sample.txt");
        BufferedReader br = new BufferedReader(fr);
        String str;
        while ((str = br.readLine()) != null) {
            System.out.println(str);
        }
        br.close();

        //Loop statement
        /*File file = new File("D:\\\\Dileep\\\\Software testing\\\\Softwares\\\\sample.txt");
        Scanner sc = new Scanner(file);
        while (sc.hasNext()) {
            System.out.println(sc.nextLine());
        }*/

        //Using delimiter
        //sc.useDelimiter("//z");
        //System.out.println(sc.next());

    }
}
