import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MainMenu extends JMenuBar implements ActionListener {
        JMenu menu; // One menu
        JMenuItem item;
        JMenuItem item2;     // Which has one item
        public MainMenu(){
            menu=new JMenu("Home");
            item=new JMenuItem("Log in");
            item2=new JMenuItem("My rewards");
            item.addActionListener(this);
            item2.addActionListener(this);
            add(menu);                          // Add the JMenu to the JMenuBar
            menu.add(item);                     // Add the JMenuItem to the JMenu
            menu.add(item2);
        }

        @Override
        // If 'this' is set as the ActionListener to all menu items, this method will
        // be called whenever any menu item is selected, but the ActionEvent
        // command will be the text of the menu item selected
        public void actionPerformed(ActionEvent e) {
            System.out.println(e.getActionCommand());
        }
    }


