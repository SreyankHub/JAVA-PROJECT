import javax.swing.*;
import java.awt.*;
import java.awt.color.*;
import java.awt.image.*;
import java.awt.image.ImageObserver;

public class Main {

    public static void main(String[] args) {
        //Creating Objects
        ImageIcon image = new ImageIcon("diamond_sword.png");
        JFrame Window = new JFrame();

        //Blocks Of Code To Create A Window
        Window.setSize(1000,1000);
        Window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Window.getContentPane().setBackground(new Color(12,30,190));
        Window.setTitle("Minecraft");
        Window.setIconImage(image.getImage());


        //To Make The Window Visible
        Window.setVisible(true);

    }
}
