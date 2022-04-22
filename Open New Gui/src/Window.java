import javax.swing.*;
import java.awt.*;

public class Window {

     JLabel label = new JLabel("Hello, I am A window!");

    JFrame frame = new JFrame();


    Window() {
        label.setFont(new Font("myFont",Font.BOLD,40));
        frame.add(label);
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);


    }
}
