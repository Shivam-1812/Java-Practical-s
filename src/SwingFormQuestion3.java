import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingFormQuestion3 extends JFrame {
    public SwingFormQuestion3() {
        setLayout(new FlowLayout());

        JLabel l1 = new JLabel("Name:");
        JTextField nameField = new JTextField(30);
        add(l1);
        add(nameField);

        JLabel l2 = new JLabel("Address:");
        JTextArea addressArea = new JTextArea(5, 30);
        JScrollPane scrollPane = new JScrollPane(addressArea);
        add(l2);
        add(scrollPane);

        JLabel l3 = new JLabel("Country:");
        JComboBox<String> cb1 = new JComboBox<>(new String[]{"India", "USA", "Canada", "Australia"});
        add(l3);
        add(cb1);

        JLabel l4 = new JLabel("Hobbies:");
        JList<String> list1 = new JList<>(new String[]{"Reading", "Gaming", "Traveling", "Sports"});
        list1.setVisibleRowCount(4);
        list1.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        JScrollPane hobbiesScrollPane = new JScrollPane(list1);
        hobbiesScrollPane.setPreferredSize(new Dimension(200, 80));
        add(l4);
        add(hobbiesScrollPane);

        JLabel l5 = new JLabel("Gender:");
        JRadioButton maleRadio = new JRadioButton("Male");
        JRadioButton femaleRadio = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadio);
        genderGroup.add(femaleRadio);
        add(l5);
        add(maleRadio);
        add(femaleRadio);

        JLabel l6 = new JLabel("Agree to:");
        JCheckBox termsCheckBox = new JCheckBox("Terms and Conditions");
        JCheckBox updatesCheckBox = new JCheckBox("Receive Updates");
        add(l6);
        add(termsCheckBox);
        add(updatesCheckBox);

        JButton submitButton = new JButton("Submit");
        add(submitButton);

        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String address = addressArea.getText();
                String country = (String) cb1.getSelectedItem();
                String gender = maleRadio.isSelected() ? "Male" : (femaleRadio.isSelected() ? "Female" : "Not Selected");
                java.util.List<String> hobbies = list1.getSelectedValuesList();
                boolean termsAgreed = termsCheckBox.isSelected();
                boolean updatesAgreed = updatesCheckBox.isSelected();

                JOptionPane.showMessageDialog(SwingFormQuestion3.this,
                        "Form Submitted:\n" +
                                "Name: " + name + "\n" +
                                "Address: " + address + "\n" +
                                "Country: " + country + "\n" +
                                "Gender: " + gender + "\n" +
                                "Hobbies: " + hobbies + "\n" +
                                "Terms Agreed: " + termsAgreed + "\n" +
                                "Receive Updates: " + updatesAgreed,
                        "Form Data",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }
    public static void main(String[] args) {
        SwingFormQuestion3 s3 = new SwingFormQuestion3();
        s3.setVisible(true);
        s3.setSize(600, 500);


    }
}


//import java.awt.*;
//import javax.swing.*;
//public class FormDemo extends Frame
//{
//    FormDemo()
//    {
//        setLayout(new FlowLayout());
//
//        JLabel l1 = new JLabel("name :-");
//        add(l1);
//        JTextField t1 = new JTextField(10);
//        add(t1);
//
//        JLabel l2 = new JLabel("address:-");
//        add(l2);
//        JTextArea t2 = new JTextArea(20,20);
//        add(t2);
//
//        JLabel l3 = new JLabel("Year:-");
//        add(l3);
//        JComboBox c = new JComboBox();
//        c.addItem("FY");
//        c.addItem("SY");
//        c.addItem("TY");
//        add(c);
//
//        JLabel l4 = new JLabel("subject:-");
//        add(l4);
//        String[] subjects = {"Java", "ACN", "STE"};
//        JList<String> l = new JList<>(subjects);
//        add(l);
//        JLabel l5 = new JLabel("Facilities:-");
//        add(l5);
//        JCheckBox ch = new JCheckBox("Library");
//        JCheckBox ch1 = new JCheckBox("Sport");
//        add(ch);
//        add(ch1);
//
//        JLabel l6 = new JLabel("Gender:-");
//        add(l6);
//        JRadioButton r = new JRadioButton("male",true);
//        JRadioButton r1 = new JRadioButton("female",false);
//
//        add(r);
//        add(r1);
//
//        JButton b1 = new JButton("Submit");
//        add(b1);
//
//    }
//
//    public static void main(String[] args)
//    {
//        FormDemo f = new FormDemo();
//        f.setVisible(true);
//        f.setSize(500,500);
//    }
//}