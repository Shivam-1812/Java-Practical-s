package Question5;

import java.awt.event.*;
import java.awt.*;
import java.applet.*;

public class MouseMotionListenerDemo extends Applet implements MouseMotionListener {
    Label l1;
    MouseMotionListenerDemo(){
        setLayout(new FlowLayout());
        l1 = new Label();
        add(l1);
        addMouseMotionListener(this);
    }
    public void mouseMoved(MouseEvent e) {
        setBackground(Color.blue);
        l1.setText("Mouse Moved");
        repaint();
    }
    public void mouseDragged(MouseEvent e) {
        setBackground(Color.green);
        l1.setText("Mouse Dragged");
        repaint();
    }
}
/*<applet code="MouseMotionListenerDemo" width=300 height=300></applet>*/