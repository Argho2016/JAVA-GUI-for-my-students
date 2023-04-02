import javax.swing.*;

public class MyFrame3 extends JFrame {

    public MyFrame3() {
        setTitle("My Frame");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel label = new JLabel("Hello, World!");
        add(label);
    }

    public static void main(String[] args) {
        MyFrame3 frame = new MyFrame3();
        frame.setVisible(true);
    }
}
