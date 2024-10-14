package programs;

import java.awt.*;

public class AWTButton extends Frame {
    //Abstract Window Toolkit
    AWTButton() {
        Button b = new Button("click me");
        b.setBounds(30, 100, 80, 30);//Setting button position
        add(b);//Adding button into frame
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        AWTButton a = new AWTButton();
    }
}
