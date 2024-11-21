package Question1;

import java.awt.*;
public class GridLayoutDemo extends Frame {
    GridLayoutDemo() {
        setLayout(new GridLayout());
        Button b1 = new Button("one");
        Button b2 = new Button("two");
        Button b3 = new Button("three");
        Button b4 = new Button("four");

        add(b1);
        add(b2);
        add(b3);
        add(b4);}
    public static void main(String args[]) {
        GridLayoutDemo g1 = new GridLayoutDemo();
        g1.setVisible(true);
        g1.setSize(300,300);
    }
}
