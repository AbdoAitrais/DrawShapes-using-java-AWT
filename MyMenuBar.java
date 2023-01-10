package exo2_2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class MyMenuBar extends MenuBar implements ActionListener {
    Menu menu;
    MenuItem menuItem;
    public MyMenuBar(){
        menu = new Menu("Fichier");
        menuItem = new MenuItem("Fin");
        menu.add(menuItem);
        add(menu);
        menuItem.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String label = ((MenuItem)e.getSource()).getLabel();
        if (Objects.equals(label, "Fin")){
            System.exit(1);
        }
    }
}
