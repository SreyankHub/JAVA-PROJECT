import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {


    Panel() {
        this.setPreferredSize(new Dimension(500,500));
        this.setBackground(Color.BLACK);
        this.setOpaque(true);
    }


    public void paint(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;

        g2D.setFont(new Font("MyFont",Font.BOLD,60));
        g2D.drawString("I am 2DGraphics",10,100);
        g2D.drawLine(5,150,490,150);
        g2D.drawRect(200,400,100,50);
        g2D.drawOval(50,250,100,100);
        g2D.drawOval(360,250,100,100);

    }
}
