import java.awt.*;
import java.awt.event.*;

class MyFrame6 extends Frame implements ItemListener {
    Label l;
    List list;
    Choice choice;

    public MyFrame6() {
        super("List Box and Choice Demo");

        l = new Label("No selection made yet");
        list = new List(4, true);
        choice = new Choice();

        list.add("Java");
        list.add("Python");
        list.add("C#");
        list.add("JavaScript");

        choice.add("Red");
        choice.add("Green");
        choice.add("Blue");
        choice.add("Yellow");

        list.addItemListener(this);
        choice.addItemListener(this);

        setLayout(new FlowLayout());
        add(l);
        add(list);
        add(choice);
    }

    @Override
    public void itemStateChanged(ItemEvent ie) {
        String selectedItems = "List: ";
        for (String item : list.getSelectedItems()) {
            selectedItems += item + " ";
        }
        selectedItems += "| Choice: " + choice.getSelectedItem();
        l.setText(selectedItems);
    }
}
public class ListBoxandChoice {
    public static void main(String[] args) {
        MyFrame6 f = new MyFrame6();
        f.setSize(400, 400);
        f.setVisible(true);
    }
}


//Notes in Hinglish:
//1. ListBoxandChoice class mein ek MyFrame6 object banaya gaya hai jo
//   Frame class ka ek subclass hai.
//2. MyFrame6 class mein ek Label, ek List aur ek Choice component banaya gaya hai.
//3. List aur Choice component par ItemListener lagaya gaya hai taaki jab bhi selection change ho to label update ho jaye.
//4. itemStateChanged method mein label ka text List ke selected items aur Choice ke selected item se set kiya jata hai.
//5. main method mein frame ka size set kiya gaya hai aur usse visible banaya gaya hai.
//6. List component multiple selection allow karta hai, isliye getSelectedItems() method ka use kiya gaya hai.
//7. Choice component single selection allow karta hai, isliye getSelectedItem() method ka use kiya gaya hai.