import java.text.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.text.*;

class Myframe extends JFrame {
    Myframe() {
        JTextField tf = new JTextField(15);
        
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        JFormattedTextField tf2=new JFormattedTextField(df);
        tf2.setColumns(15);
        tf2.setValue(0);


        NumberFormat nf = NumberFormat.getInstance();
        NumberFormatter nft= new NumberFormatter(nf);
        nft.setAllowsInvalid(false);
        nft.setMaximum(1000);

        JFormattedTextField tf3=new JFormattedTextField(nft);
        tf3.setColumns(15);

        this.add(tf);
        this.add(tf2);
        this.add(tf3);

        setLayout(new FlowLayout());
    }
}

public class JTextFeild {
    public static void main(String[] args) {
        Myframe frame = new Myframe();
        frame.setSize(300, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
