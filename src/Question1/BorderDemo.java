package Question1;

import java.awt.*;

public class BorderDemo extends Frame {
    BorderDemo() {
        setLayout(new BorderLayout());
        Button b1 = new Button("North");
        Button b2 = new Button("South");
        Button b3 = new Button("East");
        Button b4 = new Button("West");
        Button b5 = new Button("Center");

        add(b1, BorderLayout.NORTH);
        add(b2, BorderLayout.SOUTH);
        add(b3, BorderLayout.EAST);
        add(b4, BorderLayout.WEST);
        add(b5, BorderLayout.CENTER);
    }
    public static void main(String args[]){
        BorderDemo b1 = new BorderDemo();
        b1.setVisible(true);
        b1.setSize(300,300);
    }
}
