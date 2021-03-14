package inandout;

import inandout.Structure;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class 결제하기 extends JPanel {
	private JButton 다음,취소;
	결제하기(){
		setSize(1000,1200);
		setLayout(null);		
		setBackground(Color.white);
		
		JLabel lb1=new JLabel("주문하기");
		JLabel lb2=new JLabel("주문내역을 확인해주세요");
		lb1.setBounds(0, 0, 1000,50);
		lb2.setBounds(0,40,1000,50);
		lb1.setFont(new Font("Bernard MT", Font.BOLD, 50));
		lb2.setFont(new Font("Bernard MT", Font.BOLD, 30));
		this.add(lb1);
		this.add(lb2);
		
		다음=new JButton("다음");
		add(다음);
		Color color=new Color(152, 59, 67);
		다음.setBackground(color);
		다음.setFont(new Font("Bernard MT", Font.BOLD, 20));
		다음.setForeground(Color.white);
		다음.setLocation(500,700);
		다음.setSize(100,100);
		
		취소=new JButton("취소");
		add(취소);
		취소.setBackground(color);
		취소.setFont(new Font("Bernard MT", Font.BOLD, 20));
		취소.setForeground(Color.white);
		취소.setLocation(300,700);
		취소.setSize(100,100);
		
		취소.setBorderPainted(false);
		다음.setBorderPainted(false);
		
		취소.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Structure.getter(new Home());
			}
		});
		다음.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Structure.getter(new 결제방법());
			}
		});
		
	}
	}


