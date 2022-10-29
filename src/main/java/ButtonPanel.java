import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonPanel extends JPanel {
    private JButton but1;
    private JButton but2;
    public ButtonPanel(String text){
        but1=new JButton(text);
        but2= new JButton(text);
        but1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("You pressed the butt1");

            }
        });
        but2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("You pressed the butt2");

            }
        });
    add(but1);
    add(but2);
    setLayout(new GridLayout(2,2)); // One row, one column
    }


}
