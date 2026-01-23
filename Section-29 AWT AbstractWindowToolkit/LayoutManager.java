import java.awt.*;



class MyLayoutFrame extends Frame {
    Button b1, b2, b3, b4, b5;

    public MyLayoutFrame() {
        super("Layout Manager Demo");

        b1 = new Button("Button 1");
        b2 = new Button("Button 2");
        b3 = new Button("Button 3");
        b4 = new Button("Button 4");
        b5 = new Button("Button 5");

        setLayout(new FlowLayout());

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
    }
}
public class LayoutManager {
    public static void main(String[] args) {
        MyLayoutFrame f = new MyLayoutFrame();
        f.setSize(400, 400);
        f.setVisible(true);
    }
}

// Every Layout Explaination
/*
1. FlowLayout: Arranges components in a left-to-right flow, much like lines of text in a paragraph. When one line is filled, it wraps to the next line.
2. BorderLayout: Divides the container into five regions: North, South, East, West, and Center. Each region can hold only one component, and components are stretched to fill their region.
3. GridLayout: Arranges components in a grid of cells, with each cell being the same size. Components are added row by row.
4. CardLayout: Treats each component as a card in a deck, where only one card is visible at a time. You can switch between cards programmatically.
5. GridBagLayout: A flexible and complex layout manager that allows components to span multiple rows and columns, with varying sizes and alignments. It uses a grid of cells but provides more control over component placement.
*/