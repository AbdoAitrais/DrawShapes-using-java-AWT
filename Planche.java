package exo2_2;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Planche {
    Frame mainFrame;
    MyMenuBar myMenuBar;
    MyToolBar myToolBar;
    Dessin dessin;
    Planche(){
        mainFrame = new Frame("Planche");
        myMenuBar = new MyMenuBar();
        myToolBar = new MyToolBar();
        mainFrame.setLayout(new BorderLayout());
        dessin = new Dessin(myToolBar);

        mainFrame.add(myToolBar,BorderLayout.SOUTH);

        mainFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        mainFrame.add(dessin,BorderLayout.CENTER);

        mainFrame.setMenuBar(myMenuBar);
        mainFrame.setSize(mainFrame.getMaximumSize());
        mainFrame.setVisible(true);
    }
}
