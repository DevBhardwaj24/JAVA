import javax.swing.*;
import java.awt.*;



class MyjMenubarAndjToolBar extends JFrame {
    JMenuBar menuBar;
    JToolBar toolBar;

    

    MyjMenubarAndjToolBar() {
        menuBar = new JMenuBar();
        toolBar = new JToolBar();

        setJMenuBar(menuBar);
        add(toolBar, BorderLayout.NORTH);

        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}

public class jMenubarAndjToolBar {
    public static void main(String[] args) {
        MyjMenubarAndjToolBar frame = new MyjMenubarAndjToolBar();
        frame.setVisible(true);
    }
}
