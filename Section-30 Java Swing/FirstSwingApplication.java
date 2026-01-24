import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class Myframe extends JFrame implements ActionListener {

    JLabel l;
    JButton b;
    int count = 0;

    Myframe() {
        super("First Swing Application");

        setLayout(new FlowLayout());
        l = new JLabel("Button clicked " + count + " times");
        b = new JButton("Click Me");

        add(l);
        add(b);
        b.addActionListener(this);

        getRootPane().setDefaultButton(b);

        b.setIcon(new ImageIcon("c:/Users/Lenovo/Downloads/icons8-button-50.png"));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        l.setText("Button clicked " + count + " times");
    }
}

public class FirstSwingApplication {
    public static void main(String[] args) {
        Myframe f = new Myframe();
        f.setSize(400, 400);
        f.setLayout(new java.awt.FlowLayout());
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
