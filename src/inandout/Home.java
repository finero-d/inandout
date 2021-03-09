package inandout;

import inandout.Structure;
import inandout.MenuSelect;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.imageio.stream.ImageInputStreamImpl;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Home extends JPanel {
	public Home() {
		setLayout(null);
		setSize(1000, 1200);
		setBackground(Color.white);
		
		ImageIcon img=new ImageIcon("img/공차.png");
		JLabel label=new JLabel(img);
		JButton button=new JButton("주문하기");
		
		Font font=new Font("Bernard MT", Font.BOLD, 20);
		
		add(label);
		add(button);
		
		label.setSize(1000,800);
		label.setLocation(0, 0);
		
		button.setSize(200, 100);
		button.setLocation(400, 800);
		button.setFont(font);
		button.setBackground(Color.white);
		button.setBorderPainted(false);
		
		button.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				Structure.getter(new MenuSelect());				
			}
		});
	}
}
