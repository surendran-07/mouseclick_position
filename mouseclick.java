package sem;

import java.awt.*;
import java.awt.event.*;

public class mouseclick extends Frame implements MouseListener {
    Label i;

    mouseclick() {
        // Registering the mouse listener
        addMouseListener(this);

        // Initializing the label
        i = new Label();
        i.setBounds(50, 50, 200, 30);  // Setting label position and size
        add(i);

        // Setting frame properties
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        i.setText("Mouse Clicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {
    	 i.setText("Mouse pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    	 i.setText("Mouse released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    	 i.setText("Mouse entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
    	 i.setText("Mouse exited");
    }

    public static void main(String[] args) {
        new mouseclick();
    }
}
