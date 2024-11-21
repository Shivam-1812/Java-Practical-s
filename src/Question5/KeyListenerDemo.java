package Question5;

import java.awt.event.*;
import java.awt.*;

public class KeyListenerDemo extends Frame implements KeyListener {
    Label l1;
    KeyListenerDemo() {
        setLayout(new FlowLayout());
        l1 = new Label();
        add(l1);
        addKeyListener(this);
    }
    public void keyPressed(KeyEvent e) {
        l1.setText("Key pressed: "+KeyEvent.getKeyText(e.getKeyCode()));
    }
    public void keyReleased(KeyEvent e) {
        l1.setText("Key released: "+KeyEvent.getKeyText(e.getKeyCode()));
    }
    public void keyTyped(KeyEvent e) {
        l1.setText("KeyTyped: "+KeyEvent.getKeyText(e.getKeyCode()));
    }
    public static void main(String args[]){
        KeyListenerDemo frame = new KeyListenerDemo();
        frame.setSize(300,300);
        frame.setVisible(true);
    }
}
