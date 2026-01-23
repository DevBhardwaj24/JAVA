import java.awt.*;
import java.awt.event.*;

class MyFrame4 extends Frame implements TextListener, ActionListener {
    Label l1, l2;
    TextField tf;

    public MyFrame4() {
        super("Text Feild Demo");

        l1 = new Label("No text is entered yet");
        l2 = new Label("Enter key is not yet hit");
        tf = new TextField(20);

        tf.addTextListener(this);
        tf.addActionListener(this);

        setLayout(new FlowLayout());
        add(l1);
        add(tf);
        add(l2);
    }

    @Override
    public void textValueChanged(TextEvent te) {
        l1.setText(tf.getText());
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        l2.setText(tf.getText());
    }
}

public class TextFeildDemo {
    public static void main(String[] args) {
        MyFrame4 f = new MyFrame4();
        f.setSize(400, 400);
        f.setVisible(true);
    }
}
