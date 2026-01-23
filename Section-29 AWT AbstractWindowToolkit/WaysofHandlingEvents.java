import java.awt.*;
import java.awt.event.*;



class MyFrame11 extends Frame implements ActionListener {
    
    TextField tf;
    Button btn;
    int clickCount = 0;

    public MyFrame11() {
        super("Event Handling Demo");


        tf = new TextField();
        tf.setBounds(50, 50, 150, 20);

        btn = new Button("Click Me");
        btn.setBounds(50, 100, 100, 30);
        btn.addActionListener(this);

        add(tf);
        add(btn);

        setSize(400, 400);
        setLayout(null);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        clickCount++;
        tf.setText("Button clicked " + clickCount + " times");
    }
}

public class WaysofHandlingEvents {
    public static void main(String[] args) {
        MyFrame11 f = new MyFrame11();
        f.setSize(400, 400);
        f.setVisible(true);
    }
}

//Notes:
// There are several ways to handle events in Java AWT:
// 1. Implementing Listener Interfaces: Create a class that implements the appropriate listener interface (e.g., ActionListener, MouseListener) and override its methods to handle events.
// 2. Using Adapter Classes: Extend an adapter class (e.g., MouseAdapter,
// KeyAdapter) and override only the methods you need, instead of implementing all methods of the listener interface.
// 3. Anonymous Inner Classes: Create an instance of the listener interface or adapter class as
// an anonymous inner class and override its methods inline.
// 4. Lambda Expressions (Java 8 and later): Use lambda expressions to provide a concise implementation of functional interfaces (interfaces with a single abstract method).
// In this example, we demonstrate handling a button click event using the ActionListener interface. When the button is clicked, the actionPerformed() method is called,
// and we update the text field to show the number of times the button has been clicked.    
// You can choose any of the above methods based on your requirements and coding style.
