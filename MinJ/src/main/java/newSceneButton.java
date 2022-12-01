import java.awt.*;
import javax.swing.*;

public class newSceneButton {
    private JButton b = new JButton("Add Scene");
    private JPanel p = new JPanel();

    public newSceneButton(){
        b.setSize(100, 50);
        p.setSize(100, 50);
        p.setLayout(null);
        p.add(b);
    }

    public JButton getB(){return b;}

    public JPanel getP(){return p;}
}
