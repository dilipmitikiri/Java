package programs;

import java.awt.*;

public class AWTTextArea {
    AWTTextArea() {
        Frame f = new Frame();
        TextArea area = new TextArea("Welcome Abstract Window Tooltip Text area");
        area.setBounds(10, 30, 300, 300);
        f.add(area);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String args[]) {
        new AWTTextArea();
    }
}
