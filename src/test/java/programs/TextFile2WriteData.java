package programs;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TextFile2WriteData {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("D:\\Dileep\\Software testing\\Softwares\\sample1.txt");

        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("Maven");
        bw.write("BitBucket");
        bw.write("Jira");

        System.out.println("Finished");
        bw.close();
    }
}
