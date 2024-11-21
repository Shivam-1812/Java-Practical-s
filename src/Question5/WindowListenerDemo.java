package Question5;

import java.awt.event.*;
import java.awt.*;

public class WindowListenerDemo extends Frame implements WindowListener {
    WindowListenerDemo() {
        addWindowListener(this);
    }
    public void windowOpened(WindowEvent e) {
        System.out.println("windowOpened");
    }
    public void windowClosing(WindowEvent e) {
        System.out.println("windowClosing");
    }
    public void windowClosed(WindowEvent e) {
        System.out.println("windowClosed");
    }
    public void windowIconified(WindowEvent e) {
        System.out.println("windowIconified");
    }
    public void windowDeiconified(WindowEvent e) {
        System.out.println("windowDeiconified");
    }
    public void windowActivated(WindowEvent e) {
        System.out.println("windowActivated");
    }
    public void windowDeactivated(WindowEvent e) {
        System.out.println("windowDeactivated");
    }
    public static void main (String args[]){
        WindowListenerDemo wl = new WindowListenerDemo();
        wl.setVisible(true);
        wl.setSize(300, 300);
    }
}
