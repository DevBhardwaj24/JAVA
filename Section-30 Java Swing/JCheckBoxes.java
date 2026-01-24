import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.KeyEvent;


class MyJCheckBox extends JFrame implements ActionListener{
    JCheckBox c1,c2;

    JRadioButton r1,r2;

    JTextField tf;

    MyJCheckBox(){
        super("JCheckBox and JRadioButton Example");

        tf=new JTextField("Demo text",20);
        tf.setBounds(10,20,100,80);


        
        c1=new JCheckBox("C++");
        c1.setMnemonic(KeyEvent.VK_B);
        c2=new JCheckBox("Java");
        c2.setMnemonic(KeyEvent.VK_J);



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
            break;
       } 

       int b=0,i=0;
         if(c1.isSelected()){
              b=Font.BOLD;
         }
        if(c2.isSelected()){
                i=Font.ITALIC;
        }
        tf.setFont(new Font("Serif",b+i,12));
    }
}

public class JCheckBoxes {
    public static void main(String[] args) {
        MyJCheckBox frame = new MyJCheckBox();
        frame.setSize(300,200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

//Notes:
//1. JCheckBox is a component that can be selected or deselected.
//2. JRadioButton is used to create a group of buttons where only one button can be selected at a time.
//3. ActionListener is used to handle action events like button clicks.
//4. ButtonGroup is used to group JRadioButtons so that only one can be selected at a time.
//5. setMnemonic() method is used to set a keyboard shortcut for the component.
//6. setActionCommand() method is used to set a command string for the action event.
//7. Font class is used to set the font style of the text in JTextField.
//8. FlowLayout is used to arrange components in a left-to-right flow, much like lines of text in a paragraph.
//9. The actionPerformed() method is overridden to define the actions to be performed when an
//   action event occurs. component is interacted with. 
//10. The isSelected() method is used to check if a JCheckBox is selected or not.
//11. The setFont() method is used to set the font of the text in JTextField.
