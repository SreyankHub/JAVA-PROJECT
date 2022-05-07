//imports
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel extends JPanel implements ActionListener {

    //variables
    final int Panel_Height = 500;
    final int Panel_Width = 500;
    Timer timer;
    Image image;
    int xVelocity = 3;
    int yVelocity = 1;
    int x = 0;
    int y = 0;


    //constructor
    Panel(){
        //panel
        this.setBackground(Color.BLACK);
        this.setOpaque(true);
        this.setPreferredSize(new Dimension(Panel_Width,Panel_Height));
        //image and timer
        image = new ImageIcon("diamond_sword.png").getImage();
        timer = new Timer(10,this);
        timer.start();
    }
    //Graphics2D
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2D = (Graphics2D) g;
        g2D.drawImage(image,x,y,50,50,null);

    }


    @Override
    public void actionPerformed(ActionEvent e) {

        //for moving the image x position
        if(x>500 - 50 || x<0) {
            xVelocity = xVelocity * -1;
        }
        x = x + xVelocity;

        //for moving the image y position
        if(y>500 - 50 || x<0) {
            yVelocity = yVelocity * -1;
        }
        y = y + yVelocity;
        //Repainting the image
        repaint();
    }
}
