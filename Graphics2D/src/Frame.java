import javax.swing.*;

public class Frame extends JFrame {

    Panel MyPanel = new Panel();

    Frame() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.add(MyPanel);
        this.pack();
        this.setVisible(true);

    }

}
