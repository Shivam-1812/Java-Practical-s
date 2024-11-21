package Question5;

import java.awt.event.*;
import java.awt.*;
import java.applet.*;

public class MouseListenerDemo extends Applet implements MouseListener  {
    Label l1;
    MouseListenerDemo() {
        setLayout(new FlowLayout());
        l1 = new Label();
        add(l1);
        addMouseListener(this);
    }
    public void mouseEntered(MouseEvent e) {
        l1.setText("Mouse Entered");
        setBackground(Color.green);
        repaint();
    }
    public void mouseExited(MouseEvent e) {
        l1.setText("Mouse Exited");
        setBackground(Color.red);
        repaint();
    }
    public void mousePressed(MouseEvent e) {
        l1.setText("Mouse Pressed");
        setBackground(Color.yellow);
        repaint();
    }
    public void mouseClicked(MouseEvent e) {
        l1.setText("Mouse Clicked");
        setBackground(Color.blue);
        repaint();
    }
    public void mouseReleased(MouseEvent e) {
        l1.setText("Mouse Released");
        setBackground(Color.pink);
        repaint();
    }
}
/*<applet code="MouseListenerDemo.class" width=300 height=300></applet>*/
