import javax.swing.*;

public class MyFrame1 extends JFrame {

    private JLabel label;
    private JTextField textField;
    private JButton button;

    public MyFrame1() {
        setTitle("My GUI");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);

        label = new JLabel("Enter your name:");
        textField = new JTextField(20);
        button = new JButton("Say Hello");

        JPanel panel = new JPanel();
        panel.add(label);
        panel.add(textField);
        panel.add(button);
        add(panel);
    }

    public static void main(String[] args) {
        MyFrame1 frame = new MyFrame1();
        frame.setVisible(true);
    }
}
