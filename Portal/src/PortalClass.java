import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class PortalClass implements ActionListener {
	
	JTextField field = new JTextField();
	JButton[] button = new JButton[4];
	
	PortalClass() {
		
	JFrame frame = new JFrame();
	frame.setDefaultCloseOperation(3);
	frame.setLayout(new FlowLayout());
	frame.setLocationRelativeTo(null);
	frame.setSize(900,500);
	
	field.setBackground(Color.black);
	field.setFont(new Font("MyFont",Font.BOLD,200));
	field.setText("Color");
	
	
	for(int x=0;x<button.length;x++) {
		button[x] = new JButton();
		button[x].addActionListener(this);
		button[x].setFont(new Font("MyFont",Font.BOLD,100));
		button[x].setText(""+x+"");
		frame.add(button[x]);
	}
	frame.add(field);
	
	
	frame.setVisible(true);
	
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==button[0]) {
			field.setBackground(Color.BLUE);
		}
		else if(e.getSource()==button[1]) {
			field.setBackground(Color.CYAN);
		}
		else if(e.getSource()==button[2]) {
			field.setBackground(Color.GREEN);
		}
		
		else {
			field.setBackground(Color.YELLOW);
		}
		
	
	
}


}
