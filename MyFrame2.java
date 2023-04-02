import javax.swing.*;
import java.awt.event.*;
import java.awt.BorderLayout;
import java.awt.Container;

public class MyFrame2 extends JFrame {

    private JLabel label;
    private JTextField textField;
    private JButton button;

    public MyFrame2() {
        setTitle("My GUI");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);

        label = new JLabel("Enter your name:");
        textField = new JTextField(20);
        button = new JButton("Say Hello");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Hello, " + textField.getText() + "!");
            }
        });

        JPanel panel = new JPanel();
        panel.add(label);
        panel.add(textField);
        panel.add(button);
        add(panel);
    }

    public static void main(String[] args) {
        MyFrame2 frame = new MyFrame2();
        frame.setVisible(true);
    }
}
