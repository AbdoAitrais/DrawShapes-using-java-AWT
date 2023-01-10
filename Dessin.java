package exo2_2;

import java.awt.*;
import java.awt.event.*;
import java.util.Objects;

public class Dessin extends Canvas {
    Point pointInitial;
    Point pointFinal;
    MyToolBar myToolBar;
    Dessin(MyToolBar myToolBar){
        super();
        this.myToolBar = myToolBar;
        pointFinal = pointInitial = getLocation();
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                pointInitial = e.getPoint();
            }
        });
        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                pointFinal = e.getPoint();
                repaint();
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        switch (myToolBar.shape) {
            case MyToolBar.RECTANGLE ->{
                g.drawRect(pointInitial.x, pointInitial.y, (pointFinal.x - pointInitial.x), (pointFinal.y - pointInitial.y));
                if(myToolBar.isFilled){
                    g.setColor(myToolBar.myColorPicker.currentColor);
                    g.fillRect(pointInitial.x, pointInitial.y, (pointFinal.x - pointInitial.x), (pointFinal.y - pointInitial.y));
                }
            }
            case MyToolBar.ELLIPSE ->{
                g.drawOval(pointInitial.x, pointInitial.y, (pointFinal.x - pointInitial.x), (pointFinal.y - pointInitial.y));
                if(myToolBar.isFilled) {
                    g.setColor(myToolBar.myColorPicker.currentColor);
                    g.fillOval(pointInitial.x, pointInitial.y, (pointFinal.x - pointInitial.x), (pointFinal.y - pointInitial.y));
                }
            }
            default -> {
            }
        }
    }
}
