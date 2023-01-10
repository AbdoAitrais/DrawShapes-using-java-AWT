package exo2_2;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class MyColorPicker extends Panel implements ItemListener {
    Checkbox[] checkboxes;
    Color currentColor;
    CheckboxGroup checkboxGroup;
    public MyColorPicker() {
        checkboxGroup = new CheckboxGroup();
        this.checkboxes = new Checkbox[5];
        for (int i = 0; i < 5; i++) {
            checkboxes[i] = new Checkbox("",checkboxGroup,false);
            add(checkboxes[i]);
            checkboxes[i].addItemListener(this);
        }
        checkboxes[0].setBackground(Color.BLACK);
        checkboxes[0].setState(true);
        checkboxes[1].setBackground(Color.RED);
        checkboxes[2].setBackground(Color.BLUE);
        checkboxes[3].setBackground(Color.YELLOW);
        checkboxes[4].setBackground(Color.GREEN);

        currentColor = checkboxGroup.getSelectedCheckbox().getBackground();

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        currentColor = checkboxGroup.getSelectedCheckbox().getBackground();
    }
}
