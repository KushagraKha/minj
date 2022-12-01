import javax.swing.*;

public class window {
    private String name = "Default";
    private int x = 400;
    private int y = 300;
    JFrame window = new JFrame(name);

    public window(){
        window.setSize(x, y);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        window.setResizable(true);
    }

    public window(String name){
        window.setTitle(name);
        window.setSize(x, y);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        window.setResizable(true);
    }

    //getters
    public String getName() {
        return name;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public JFrame getWindow(){return window;}

    //setters
    public void setName(String n){
        this.name = n;
    }

    public void setX(int width){
        this.x = width;
    }

    public void setY(int height){
        this.y = height;
    }

}
