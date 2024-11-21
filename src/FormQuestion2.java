import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormQuestion2 extends Frame {
    public FormQuestion2() {
        setLayout(new FlowLayout());

        Label l1 = new Label("Name:");
        TextField n1 = new TextField(30);
        add(l1);
        add(n1);

        Label l2 = new Label("Address:");
        TextArea a1 = new TextArea(5, 30);
        add(l2);
        add(a1);

        Label l3 = new Label("Country:");
        Choice c1 = new Choice();
        c1.add("India");
        c1.add("USA");
        c1.add("Canada");
        c1.add("Australia");
        add(l3);
        add(c1);

        Label l4 = new Label("Hobbies:");
        List list1 = new List(4, true);
        list1.add("Reading");
        list1.add("Gaming");
        list1.add("Traveling");
        list1.add("Sports");
        add(l4);
        add(list1);

        Label l5 = new Label("Gender:");
        CheckboxGroup cbg = new CheckboxGroup();
        Checkbox cb1 = new Checkbox("Male", cbg, true);
        Checkbox cb2 = new Checkbox("Female", cbg, false);
        add(l5);
        add(cb1);
        add(cb2);

        Label l6 = new Label("Agree to:");
        Checkbox cb3 = new Checkbox("Terms and Conditions");
        Checkbox cb4 = new Checkbox("Receive Updates");
        add(l6);
        add(cb3);
        add(cb4);

        Button b1 = new Button("Submit");
        add(b1);

        b1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                String name = n1.getText();
                String address = a1.getText();
                String country = c1.getSelectedItem();
                String gender = cbg.getSelectedCheckbox() != null
                        ? cbg.getSelectedCheckbox().getLabel()
                        : "Not selected";
                String hobbies = String.join(", ", list1.getSelectedItems());
                boolean termsAgreed = cb3.getState();
                boolean updatesAgreed = cb4.getState();

                System.out.println("Form Data:");
                System.out.println("Name: " + name);
                System.out.println("Address: " + address);
                System.out.println("Country: " + country);
                System.out.println("Gender: " + gender);
                System.out.println("Hobbies: " + hobbies);
                System.out.println("Agreed to Terms: " + termsAgreed);
                System.out.println("Receive Updates: " + updatesAgreed);

                String message = "Form Submitted Successfully!\n" +
                        "Name: " + name + "\n" +
                        "Country: " + country;
                Dialog dialog = new Dialog(FormQuestion2.this, "Submission", true);
                dialog.setSize(300, 200);
                dialog.setLayout(new FlowLayout());
                dialog.add(new Label(message));
                Button closeButton = new Button("Close");
                closeButton.addActionListener(event -> dialog.dispose());
                dialog.add(closeButton);
                dialog.setVisible(true);
            }
        });

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        FormQuestion2 f1 =new FormQuestion2();
        f1.setSize(600, 400);
        f1.setVisible(true);

    }
}

