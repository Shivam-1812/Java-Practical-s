package Question1;

import java.awt.*;
public class FlowLayoutDemo extends Frame {
    FlowLayoutDemo(){
        setLayout(new FlowLayout());
        Button b1 = new Button("Button");
        add(b1);
    }
    public static void main(String args[]) {
        FlowLayoutDemo f1 = new FlowLayoutDemo();
        f1.setVisible(true);
        f1.setSize(300, 300);
    }
}
