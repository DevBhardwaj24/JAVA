import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class MyJsliderandJprogressBar extends JFrame implements ChangeListener {
    JSlider slider;
    JProgressBar progressBar;

    MyJsliderandJprogressBar() {
        slider = new JSlider(0, 100, 0);
        slider.setBounds(50, 50, 300, 50);
        slider.setMajorTickSpacing(20);
        slider.setMinorTickSpacing(5);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.addChangeListener(this);

        progressBar = new JProgressBar(0, 100);
        progressBar.setBounds(50, 150, 300, 50);
        progressBar.setValue(0);
        progressBar.setStringPainted(true);

        add(slider);
        add(progressBar);

        setSize(400, 300);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void stateChanged(ChangeEvent e) {
        int value = slider.getValue();
        progressBar.setValue(value);
    }
}


public class JsliderandJprogressBar {
    public static void main(String[] args) {
        MyJsliderandJprogressBar frame = new MyJsliderandJprogressBar();
        frame.setVisible(true);

    }
}


// Notes:
// In this example, we create a JFrame that contains a JSlider and a JProgressBar
// The JSlider allows the user to select a value between 0 and 100, with tick marks and labels for better usability.
// The JProgressBar displays the current value of the slider.
// When the user moves the slider, the stateChanged method is triggered, updating the progress bar to reflect the slider's value.
// To run this code, simply copy it into a file named JsliderandJprogressBar
// and compile and run it using a Java development environment that supports Swing.
// The GUI window will display the slider and progress bar, allowing interaction between the two components.
// The main method initializes the GUI.
// The MyJsliderandJprogressBar class sets up the JFrame, slider, and progress bar, and handles the change events.
// The ChangeListener interface is implemented to respond to slider movements.
// The stateChanged method updates the progress bar whenever the slider's value changes.java and compile and run it using a Java development environment that supports Swing.
// The GUI window will display the slider and progress bar, allowing interaction between the two components.
// The main method initializes the GUI.
