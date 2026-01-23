import java.awt.*;
import java.awt.event.*;


class MyFrame5 extends Frame implements TextListener {
    Label l;
    TextArea ta;

    public MyFrame5() {
        super("Text Area Demo");

        l = new Label("No text is entered yet");
        ta = new TextArea(5, 20);

        ta.addTextListener(this);

        setLayout(new FlowLayout());
        add(l);
        add(ta);
    }

    @Override
    public void textValueChanged(TextEvent te) {
        l.setText(ta.getText());
    }
}
public class TextAreaDemo {
    public static void main(String[] args) {
        MyFrame5 f = new MyFrame5();
        f.setSize(400, 400);
        f.setVisible(true);
    }
}

//Notes in Hinglish:
//1. TextAreaDemo class mein ek MyFrame5 object banaya gaya hai jo Frame class ka ek subclass hai.  
//2. MyFrame5 class mein ek Label aur ek TextArea component banaya gaya hai.  
//3. TextArea component par TextListener lagaya gaya hai taaki jab bhi text change  ho to label update ho jaye.                                                                                             
//4. textValueChanged method mein label ka text TextArea ke current text se set kiya jata hai.
//5. main method mein frame ka size set kiya gaya hai aur usse visible banaya gaya hai.
