import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class start implements ActionListener {
    JButton mybutton = new JButton("Open Window");
    JFrame frame = new JFrame();
    start() {


        mybutton.setBounds(300, 200, 200, 50);
        mybutton.setFocusPainted(false);
        mybutton.addActionListener(this);



        frame.add(mybutton);
        frame.setLayout(null);
        frame.setSize(700, 700);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==mybutton) {
            frame.dispose();
            new Window();



        }
    }
}
