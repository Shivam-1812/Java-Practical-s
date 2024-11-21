package Question4;

import java.awt.*;
import javax.swing.*;

public class ScrollQuestion4 extends JApplet
{
    public void init()
    {
        setLayout(new FlowLayout());

        JTextArea t = new JTextArea(20,20);
        t.setText("this s scroll pane and program is created by chaitanya");

        JScrollPane js = new JScrollPane(t);
        add(js);
    }
}
/*<applet code= ScrollDemo.class width=500 height=500></applet>*/