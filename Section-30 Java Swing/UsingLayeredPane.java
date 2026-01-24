import javax.swing.*;


class LayeredPaneExample extends JFrame {
    public LayeredPaneExample() {
        setTitle("Using JLayeredPane Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLayeredPane layeredPane = getLayeredPane();
        
        JButton button1 = new JButton("Button 1");
        button1.setBounds(50, 50, 100, 30);
        layeredPane.add(button1, JLayeredPane.DEFAULT_LAYER);
        
        JButton button2 = new JButton("Button 2");
        button2.setBounds(80, 80, 100, 30);
        layeredPane.add(button2, JLayeredPane.PALETTE_LAYER);
        
        JButton button3 = new JButton("Button 3");
        button3.setBounds(110, 110, 100, 30);
        layeredPane.add(button3, JLayeredPane.MODAL_LAYER);
    }

    
}

public class UsingLayeredPane {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            LayeredPaneExample frame = new LayeredPaneExample();
            frame.setVisible(true);
        });
    }
}


//Notes:
// In this example, we create a JFrame that contains a JLayeredPane.
// We add three buttons to the layered pane, each on a different layer.
// Button 1 is on the DEFAULT_LAYER, Button 2 is on the PALETTE_LAYER, and Button 3 is on the MODAL_LAYER.
// This demonstrates how components can overlap and be stacked in different layers within the same container.
// The buttons will overlap each other based on their layer order, with Button 3 being on top, followed by Button 2, and then Button 1 at the bottom.
//
// To run this code, simply copy it into a file named UsingLayeredPane.java and compile and run it using a Java development environment that supports Swing.
// The GUI window will display the three buttons stacked on top of each other according to their layers.
// The main method initializes the GUI on the Event Dispatch Thread for thread safety.
// The LayeredPaneExample class sets up the JFrame and adds the buttons to the layered pane.
