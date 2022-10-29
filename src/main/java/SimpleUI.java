
import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import Drawings.Drawing;

class SimpleUI {
    static GraphicsConfiguration gc;
    public static void main(String[] args) {
        JFrame frame= new JFrame(gc);	// Create a new JFrame
        frame.setSize(500,300);
        frame.getContentPane().add(new ButtonPanel("Press me"));
        frame.setJMenuBar(new MainMenu());
        frame.setVisible(true);
        frame.add(new Drawing());
        // This next line closes the program when the frame is closed
        frame.addWindowListener(new WindowAdapter() {	// Closes the program if close window clicked
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

    }
}
