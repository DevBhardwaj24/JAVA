import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;



class MyJspinnerlistAndjcomboboxAndjList extends JFrame implements ChangeListener {
    JSpinner spinner;
    JList<String> list;
    JComboBox<String> comboBox;

    MyJspinnerlistAndjcomboboxAndjList() {
        spinner = new JSpinner(new SpinnerNumberModel(0, 0, 100, 1));
        spinner.setBounds(50, 50, 100, 30);
        spinner.addChangeListener(this);

        String[] items = {"Item 1", "Item 2", "Item 3"};
        list = new JList<>(items);
        list.setBounds(50, 100, 150, 100);

        comboBox = new JComboBox<>(items);
        comboBox.setBounds(50, 220, 150, 30);

        add(spinner);
        add(list);
        add(comboBox);

        setSize(400, 350);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void stateChanged(ChangeEvent e) {
        int value = (Integer) spinner.getValue();
    }
}

public class JspinnerlistAndjcomboboxAndjList {
    public static void main(String[] args) {
        MyJspinnerlistAndjcomboboxAndjList frame = new MyJspinnerlistAndjcomboboxAndjList();
        frame.setVisible(true);
    }
}
