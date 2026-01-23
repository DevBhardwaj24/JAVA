import java.awt.*;

class MyFrame extends Frame{
    Label l;
    TextField tf;
    Button b;

    //constructor is made
    public MyFrame(){
        super("My App");

        setLayout(new FlowLayout());

        l=new Label("Name");
        tf=new TextField(20);//visible size of the textfeild  
        b=new Button("OK");

        add(l);
        add(tf);
        add(b);

    }
}
public class BasicGUI {
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setSize(400,400);
        f.setVisible(true);
    }
}
