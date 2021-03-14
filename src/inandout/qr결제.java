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

public class qr결제 extends JPanel {
	private JButton 이전,확인;
	qr결제(){
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
		이전=new JButton("이전");
		add(이전);
		확인=new JButton("확인");
		add(확인);
		Color color=new Color(152, 59, 67);
		이전.setBackground(color);
		이전.setFont(new Font("Bernard MT", Font.BOLD, 20));
		이전.setForeground(Color.white);
		이전.setLocation(300,700);
		이전.setSize(100,100);
		확인.setFont(new Font("Bernard MT", Font.BOLD, 20));
		확인.setForeground(Color.white);
		확인.setBackground(color);
		확인.setLocation(500,700);
		확인.setSize(100,100);
		
		
		이전.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Structure.getter(new 결제방법());
			}
		});

		확인.addActionListener(new ActionListener() {
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

