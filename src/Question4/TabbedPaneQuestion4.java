package Question4;
import java.awt.*;
import javax.swing.*;


public class TabbedPaneQuestion4 extends JApplet {
    public void init() {
        Container cp = getContentPane();
        JTabbedPane jtp = new JTabbedPane();
        jtp.addTab ("Flowers", new Pan1());
        jtp.addTab ("Fruits", new Pan2());
        cp.add(jtp);
    }
}


class Pan1 extends Panel{
    Pan1() {
        setLayout(new FlowLayout());
        JComboBox jc = new JComboBox();
        jc.addItem("Lotus");
        jc.addItem("Rose");
    }
}


class Pan2 extends Panel{
    Pan2() {
        setLayout(new FlowLayout());
        JCheckBox C1 = new JCheckBox("Mango");
        JCheckBox C2 = new JCheckBox("Apple");
        add(C1);
        add(C2);
    }
}


/*<applet code = TabbedPaneQuestion4.class width=500 height=500></applet>*/