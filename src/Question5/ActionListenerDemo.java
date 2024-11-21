package Question5;

import java.awt.event.*;
import java.awt.*;

public class ActionListenerDemo extends Frame implements ActionListener {
    TextField t1,t2,t3;
    public ActionListenerDemo(){
        setLayout(new GridLayout(0,2));
        add(new Label("First Number: "));
        t1 = new TextField(10);
        add(t1);

        add(new Label("Second Number: "));
        t2 = new TextField(10);
        add(t2);

        Button b = new Button("Add");
        add(b);
        t3 = new TextField(10);
        add(t3);
        b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());

        t3.setText(" "+(a+b));
    }

    public static void main(String args[]) {
        ActionListenerDemo f = new ActionListenerDemo();
        f.setVisible(true);
        f.setSize(300,300);
    }
}
