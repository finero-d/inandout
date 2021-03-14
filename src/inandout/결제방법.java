package inandout;
import inandout.Structure;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class 결제방법 extends JPanel {
	private JButton 이전,현금,qr;
	결제방법(){
		setSize(1000,1200);
		setLayout(null);
		setBackground(Color.white);
		
		JLabel lb1=new JLabel("결제방법 선택");
		JLabel lb2=new JLabel("결제 방식을 선택해 주세요");
		lb1.setBounds(0, 0, 1000,50);
		lb2.setBounds(0,50,1000,50);
		lb1.setFont(new Font("Bernard MT", Font.BOLD, 50));
		lb2.setFont(new Font("Bernard MT", Font.BOLD, 30));
		this.add(lb1);
		this.add(lb2);
		이전=new JButton("이전");
		add(이전);
		Color color=new Color(152, 59, 67);
		이전.setForeground(Color.white);
		이전.setBackground(color);
		이전.setLocation(300,700);
		이전.setSize(100,100);
		
		이전.setBorderPainted(false);
		이전.setFont(new Font("Bernard MT", Font.BOLD, 20));
		
		현금=new JButton(new ImageIcon("img/현금.png"));
		현금.setBorderPainted(false);
		JLabel moneylb=new JLabel("현금결제");
		
		qr=new JButton(new ImageIcon("img/qr결제.jpg"));
		qr.setBackground(color.white);
		qr.setBorderPainted(false);
		
		JLabel qrlb=new JLabel("qr결제");
		add(현금);
		add(qr);
		add(moneylb);
		add(qrlb);
		moneylb.setBounds(270, 500, 500,50);
		qrlb.setBounds(680,500,500,50);
		현금.setLocation(200,300);
		현금.setSize(200,200);
		qr.setLocation(600,300);
		qr.setSize(200,200);
		
		이전.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Structure.getter(new 결제하기());
			}
		});
		현금.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int r=JOptionPane.showConfirmDialog 
						(null,"현금으로 결제하시겠습니까?","결제", JOptionPane.YES_NO_OPTION);
					 if(r==JOptionPane.YES_OPTION) {
						 Structure.getter(new Home());
					 }			
				}			
			
		});
		qr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Structure.getter(new Qrs());
				
			}
		});
		
	

	}


}
