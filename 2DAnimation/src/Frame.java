import javax.swing.*;

public class Frame extends JFrame {

    Panel Panel = new Panel();

    Frame(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(Panel);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
    }
}
