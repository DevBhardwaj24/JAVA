import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.KeyEvent;


class MyBorders extends JFrame implements ActionListener{
    JCheckBox c1,c2;

    JRadioButton r1,r2;

    JTextField tf;

    MyBorders(){
        super("JCheckBox and JRadioButton Example");

        tf=new JTextField("Demo text",20);
        tf.setBounds(10,20,100,80);

        c1=new JCheckBox("Line Border");
        c1.setMnemonic(KeyEvent.VK_L);
        c2=new JCheckBox("Etched Border");
        c2.setMnemonic(KeyEvent.VK_E);
        r1=new JRadioButton("Lower");
        r2=new JRadioButton("Upper");
        ButtonGroup bg=new ButtonGroup();
        bg.add(r1);bg.add(r2);
        c1.addActionListener(this);
        c2.addActionListener(this);
        r1.addActionListener(this);
        r2.addActionListener(this);
        r1.setActionCommand("lower");
        r2.setActionCommand("upper");
        setLayout(new FlowLayout());
        add(tf);
        add(c1);
        add(c2);
        add(r1);
        add(r2);

    } 

    public void actionPerformed(ActionEvent e){    
       switch (e.getActionCommand()) {
        case "Lower":
            tf.setFont(new Font("Serif",Font.BOLD,12));    
            break;
            
        case "Upper":
            tf.setFont(new Font("Serif",Font.ITALIC,12));    
            break;

        default:
            if(c1.isSelected()){
                tf.setBorder(BorderFactory.createLineBorder(Color.RED,3));
            } else {
                tf.setBorder(BorderFactory.createEmptyBorder());
            }

            if(c2.isSelected()){
                tf.setBorder(BorderFactory.createEtchedBorder());
            } else {
                tf.setBorder(BorderFactory.createEmptyBorder());
            }
            break;
       }
    }
    
}    
public class Borders {
    public static void main(String[] args) {
        MyBorders frame = new MyBorders();
        frame.setSize(300, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


//Notes:
// This code creates a simple Java Swing application that demonstrates the use of JCheckBox and JRadioButton to change the border style of a JTextField.
// The MyBorders class extends JFrame and implements ActionListener to handle user interactions.
// The application contains two checkboxes for selecting border styles (Line Border and Etched Border) and two radio buttons for changing the font style of the text field (Lower and Upper).
// When a checkbox is selected, the corresponding border style is applied to the text field. When a radio button is selected, the font style of the text field is changed accordingly.
// The main method creates an instance of MyBorders, sets its size, makes it visible, and defines the default close operation.
//1. JCheckBox is a component that can be selected or deselected.
//2. JRadioButton is used to create a group of buttons where only one button can
// be selected at a time.
//3. ActionListener is used to handle action events like button clicks.
//4. BorderFactory is used to create different types of borders for Swing components.
//5. setMnemonic() method is used to set a keyboard shortcut for the component.
//6. setActionCommand() method is used to set a command string for the action event
//7. Font class is used to set the font style of the text in JTextField.
//8. JTextField is a component that allows the user to enter and edit a single line of text.
//9. FlowLayout is a layout manager that arranges components in a left-to-right flow, much like lines of text in a paragraph.
//10. setBorder() method is used to set the border of a Swing component.
//11. Border types demonstrated include Line Border and Etched Border.
