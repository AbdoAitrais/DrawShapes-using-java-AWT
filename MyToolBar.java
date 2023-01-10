package exo2_2;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class MyToolBar extends Panel implements ItemListener {
    GridLayout toolBar;
    Choice choiceShape;
    MyColorPicker myColorPicker;
    Checkbox checkboxRempli;
    String shape;
    boolean isFilled;
    public static final String RECTANGLE = "Rectangle";
    public static final String ELLIPSE = "Ellipse";
    MyToolBar(){
        toolBar = new GridLayout(1,3);
        choiceShape = new Choice();
        choiceShape.add(RECTANGLE);
        choiceShape.add(ELLIPSE);

        checkboxRempli = new Checkbox("Remplissage");

        myColorPicker = new MyColorPicker();

        shape = choiceShape.getSelectedItem();
        isFilled = checkboxRempli.getState();

        setLayout(toolBar);
        add(choiceShape);
        add(myColorPicker);
        add(checkboxRempli);

        setBackground(Color.LIGHT_GRAY);

        choiceShape.addItemListener(this);
        checkboxRempli.addItemListener(this);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == choiceShape){
            shape = choiceShape.getSelectedItem();
        }else if (e.getSource() == checkboxRempli){
            isFilled = checkboxRempli.getState();
        }
    }
}
