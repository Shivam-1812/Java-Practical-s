import java.awt.event.*;
import java.awt.*;

public class SquareDemo extends Frame implements ActionListener {
    TextField t1,t2;
    SquareDemo(){
        setLayout(new GridLayout(0,2));
        add(new Label("First Number: "));
        t1 = new TextField(10);
        add(t1);

        Button b = new Button("Add");
        add(b);
        t2 = new TextField(10);
        add(t2);
        b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        int a = Integer.parseInt(t1.getText());

        t2.setText(" "+(a*a));
    }

    public static void main(String args[]) {
        SquareDemo f = new SquareDemo();
        f.setVisible(true);
        f.setSize(300,300);
    }
}
