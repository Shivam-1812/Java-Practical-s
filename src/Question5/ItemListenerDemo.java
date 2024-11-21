package Question5;

import java.awt.event.*;
import java.awt.*;
public class ItemListenerDemo extends Frame implements ItemListener {
    Label l1;
    ItemListenerDemo() {
        setLayout(new FlowLayout());
        add(new Label("Select any Language: "));
        Checkbox c1 = new Checkbox("English");
        Checkbox c2 = new Checkbox("Spanish");
        Checkbox c3 = new Checkbox("Portuguese");
        add(c1);
        add(c2);
        add(c3);
        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
        l1 = new Label();
        add(l1);
    }
    public void itemStateChanged(ItemEvent e) {
        l1.setText("Checkbox Checked");
    }
    public static void main(String[] args) {
        ItemListenerDemo frame = new ItemListenerDemo();
        frame.setVisible(true);
        frame.setSize(300, 300);
    }
}
