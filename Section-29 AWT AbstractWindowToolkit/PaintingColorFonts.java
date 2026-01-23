import java.awt.*;


class MyFrame12 extends Frame {
    public MyFrame12() {
        super("Painting, Color, and Fonts Demo");

        setSize(400, 400);
        setLayout(null);

        setVisible(true);
    }

    public void paint(Graphics g) {
        // Set color and font
        g.setColor(Color.BLUE);
        g.setFont(new Font("Arial", Font.BOLD, 24));

        // Draw a string
        g.drawString("Hello, AWT!", 100, 100);

        // Draw a rectangle
        g.setColor(Color.RED);
        g.drawRect(50, 150, 300, 100);

        // Fill a rectangle
        g.setColor(Color.GREEN);
        g.fillRect(60, 160, 280, 80);
    }
}

public class PaintingColorFonts {
    public static void main(String[] args) {
        MyFrame12 f = new MyFrame12();
    }
}

//Notes:
// This code creates a simple AWT application that demonstrates painting, colors, and fonts.
// The MyFrame12 class extends Frame and overrides the paint method to perform custom drawing.
// The paint method sets colors and fonts, draws a string, and draws and fills rectangles.
// The main method creates an instance of MyFrame12, which displays the window.
// The window shows the custom drawings when rendered.
