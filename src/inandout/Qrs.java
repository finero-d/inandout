package inandout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Qrs extends JPanel {
	private JButton pre,confirm;
	Qrs(){
		setSize(1000,1200);
		setLayout(null);
		setBackground(Color.white);
		
		JLabel lb1=new JLabel("qr코드를 찍어주세요");
		lb1.setBounds(0, 0, 200,50);
		this.add(lb1);
		ImageIcon qr=new ImageIcon("img/qr.jpg");
		JLabel img=new JLabel(qr);
		this.add(img);
		
		img.setSize(500,500);
		img.setLocation(200,100);
		pre=new JButton("이전");
		add(pre);
		confirm=new JButton("확인");
		add(confirm);
		
		Color color=new Color(152, 59, 67);
		
		pre.setBackground(color);
		pre.setFont(new Font("Bernard MT", Font.BOLD, 20));
		pre.setForeground(Color.white);
		pre.setLocation(300,700);
		pre.setSize(100,100);
		
		confirm.setFont(new Font("Bernard MT", Font.BOLD, 20));
		confirm.setForeground(Color.white);
		confirm.setBackground(color);
		confirm.setLocation(500,700);
		confirm.setSize(100,100);
		
		
		pre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Structure.getter(new 결제방법());
			}
		});

		confirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int r=JOptionPane.showConfirmDialog 
						(null,"결제가 완료되었습니다.","결제", JOptionPane.YES_NO_OPTION);
					 if(r==JOptionPane.YES_OPTION) {
						 Structure.getter(new Home());
					 }	
			}
		});
		

	}
}

