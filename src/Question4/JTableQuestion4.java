package Question4;

import java.awt.*;
import javax.swing.*;

public class JTableQuestion4 extends JFrame {
    JTableQuestion4() {
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        String[] colmn = {"Name", "Age", "Gender"};
        Object[][] data = {
                {"Shivam", "18", "Male"},
                {"Aditya", "20", "Female"},
                {"Chaitanya", "21", "Male"}
        };
        JTable table = new JTable(data, colmn);
        c.add(table);
    }
    public static void main(String[] args) {
        JTableQuestion4 f1 = new JTableQuestion4();
        f1.setVisible(true);
        f1.setSize(400, 300);
    }
}
