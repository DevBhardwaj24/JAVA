import java.awt.*;
import java.awt.event.*;

class MyFrame9 extends Frame {

    public MyFrame9() {
        super("Mouse Event Demo");

        setSize(400, 400);
        setLayout(null);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                System.out.println("Mouse Clicked at: (" + e.getX() + ", " + e.getY() + ")");
            }

            @Override
            public void mousePressed(java.awt.event.MouseEvent e) {
                System.out.println("Mouse Pressed at: (" + e.getX() + ", " + e.getY() + ")");
            }

            @Override
            public void mouseReleased(java.awt.event.MouseEvent e) {
                System.out.println("Mouse Released at: (" + e.getX() + ", " + e.getY() + ")");
            }
        });

        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(java.awt.event.MouseEvent e) {
                System.out.println("Mouse Dragged to: (" + e.getX() + ", " + e.getY() + ")");
            }

            @Override
            public void mouseMoved(java.awt.event.MouseEvent e) {
                System.out.println("Mouse Moved to: (" + e.getX() + ", " + e.getY() + ")");
            }
        });

        setVisible(true);
    }
}

public class MouseEvent {
    public static void main(String[] args) {
        MyFrame9 f = new MyFrame9();
        f.setSize(400, 400);    
        f.setVisible(true);
    }
}


//Notes:
// There are 5 main mouse events in Java AWT:
// 1. MouseClicked Event: When the mouse button is clicked (pressed and released)
// 2. MousePressed Event: When the mouse button is pressed down
// 3. MouseReleased Event: When the mouse button is released
// 4. MouseDragged Event: When the mouse is moved while a button is pressed
// 5. MouseMoved Event: When the mouse is moved without any buttons pressed
// To handle mouse events in Java AWT, you can implement the MouseListener and MouseMotion
// interfaces and override their methods: mouseClicked(), mousePressed(), mouseReleased(),
// mouseDragged(), and mouseMoved().
// In this example, we create a Frame that listens for mouse events and prints
// the mouse coordinates to the console when the mouse is clicked, pressed, released,
// dragged, or moved.
// Note: To ensure that the Frame receives mouse events, it must be focused.
// You can click on the Frame to give it focus before using the mouse.
// You can also use MouseAdapter and MouseMotionAdapter classes to avoid implementing
// all methods of MouseListener and MouseMotionListener interfaces.
// MouseAdapter and MouseMotionAdapter are abstract classes that implement
// MouseListener and MouseMotionListener with empty methods.
// In this example, we extend MouseAdapter and MouseMotionAdapter and override
// only the methods we need. This makes the code cleaner and easier to read.
