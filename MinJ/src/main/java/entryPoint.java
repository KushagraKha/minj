import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class entryPoint {
    window e = new window("Minj");
    newSceneButton n = new newSceneButton();
    Canvas sceneContainer = new Canvas();

    public entryPoint(){
        this.e.getWindow().add(n.getP());
        this.n.getB().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sceneContainer.setVisible(true);
            }
        });
        this.sceneContainer.setVisible(false);
    }

    public window getE(){return e;}


}
