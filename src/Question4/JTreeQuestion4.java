package Question4;

import javax.swing.*;
import javax.swing.tree.*;
import java.awt.*;

public class JTreeQuestion4 extends JFrame {
    JTreeQuestion4() {
        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());

        DefaultMutableTreeNode a = new DefaultMutableTreeNode("Avengers");
        DefaultMutableTreeNode a1 = new DefaultMutableTreeNode("Iron Man");
        DefaultMutableTreeNode a2 = new DefaultMutableTreeNode("Captain America");
        a.add(a1);
        a.add(a2);

        JTree tree = new JTree(a);
        cp.add(tree, BorderLayout.WEST);
    }
    public static void main(String[] args) {
        JTreeQuestion4 f = new JTreeQuestion4();
        f.setVisible(true);
        f.setSize(300,300);
    }

}
