import java.awt.*;
import java.awt.event.*;

class MyFrame10 extends Frame implements WindowListener {

    public MyFrame10() {
        super("Window Event Demo");

        setSize(400, 400);
        setLayout(null);

        addWindowListener(this);

        setVisible(true);
    }

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Window Opened");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Window Closing");
        dispose();
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("Window Closed");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Window Minimized");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Window Restored");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Window Activated");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("Window Deactivated");
    }
}

public class WindowEventDemo {
    public static void main(String[] args) {
        MyFrame10 f = new MyFrame10();
        f.setSize(400, 400);
        f.setVisible(true);
    }
}

//Notes:
// There are several window events in Java AWT that can be handled using the WindowListener interface
// 1. windowOpened: Invoked when the window is opened
// 2. windowClosing: Invoked when the user attempts to close the window
// 3. windowClosed: Invoked when the window has been closed
// 4. windowIconified: Invoked when the window is minimized
// 5. windowDeiconified: Invoked when the window is restored from minimized state
// 6. windowActivated: Invoked when the window becomes the active window
// 7. windowDeactivated: Invoked when the window is no longer the active window
// To handle window events in Java AWT, you can implement the WindowListener interface
// and override its methods to define custom behavior for each event.
// In this example, we create a Frame that listens for window events and prints
// messages to the console when each event occurs.
// Note: To close the window properly, we call dispose() method in the windowClosing event handler.