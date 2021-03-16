package inandout;
import inandout.Structure;
import inandout.Home;
import inandout.Milktea;
import inandout.Smoothie;
import inandout.결제하기;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class MenuSelect extends JPanel{
	
	static TextArea Orderlist_ta=new TextArea(10,20);
	
	MenuSelect(){
		setSize(1000, 1200);
		setLayout(null);
		setBackground(Color.white);
		
		JPanel Title=new JPanel();
		JPanel Menubar=new JPanel();
		JPanel Select=new JPanel();
		JPanel Orderbag=new JPanel();
		JPanel Orderlist=new JPanel();
		
		Title.setSize(1000,100);
		Title.setLocation(0, 0);
		Title.setBackground(new Color(152, 59, 67));
		Title.setLayout(null);
		
		Menubar.setSize(1000,100);
		Menubar.setLocation(0, 100);
		Menubar.setBackground(Color.white);
		Menubar.setLayout(null);
		
		Select.setSize(700, 1000);
		Select.setLocation(0, 200);
		Select.setBackground(Color.white);
		Select.setLayout(null);
		
		Orderbag.setSize(300, 1000);
		Orderbag.setLocation(700, 200);
		Orderbag.setBackground(new Color(152, 59, 67));
		Orderbag.setLayout(null);
		
		Orderlist.setSize(245, 560);
		Orderlist.setLocation(20, 100);
		Orderlist.setBackground(new Color(152, 59, 67));
		Orderlist.setLayout(new BorderLayout(10,15));
		
		Font font=new Font("Bernard MT", Font.BOLD, 15);
		Font fonts=new Font("Bernard MT", Font.BOLD, 20);
	
		JLabel lbs[]=new JLabel[2];
		String messege_lb[]= {"주문하실 메뉴를 선택해주세요","장바구니"};
		for(int i=0;i<lbs.length;i++) {
			lbs[i]=new JLabel(messege_lb[i]);
			lbs[i].setForeground(Color.white);
		}	
		
		ImageIcon img_home=new ImageIcon("img/homebutton.png");
		ImageIcon img_order=new ImageIcon("img/orderbag.jpg");
		JLabel Menubar_lbs_img=new JLabel(img_home);
		JLabel Orderbag_lbs_img=new JLabel(img_order);
		
		JButton buttons[]=new JButton[11];
		String name_bt[]= {"홈화면","밀크티","스무디","주문하기", "결제취소"};
		String name_bt2[]= {"2021 다이어리","베스트 콤비", "브라운 슈가", "오리지널티", "과일믹스", "커피"};
		for(int i=0;i<buttons.length;i++) {
			if(i<5) {
				buttons[i]=new JButton(name_bt[i]);
				if(i==0 || i==3 || i==4) {				
				buttons[i].setFont(font);
				buttons[i].setBorderPainted(false);
				}
			}else {
				buttons[i]=new JButton(name_bt2[i-5]);
			}
		}
		
		
		Orderlist_ta.setFont(fonts);
				
		lbs[0].setBounds(100, 0, 500, 100);
		lbs[0].setFont(fonts);
		
		lbs[1].setBounds(140, 30, 100, 50);
		lbs[1].setFont(font);
		
		Menubar_lbs_img.setBounds(650, 20, 50, 50);
		Orderbag_lbs_img.setBounds(80, 30, 50, 50);
		
		buttons[0].setBounds(700, 20, 120, 50);
		buttons[0].setBackground(new Color(152, 59, 67));
		buttons[0].setForeground(Color.white);
		
		//밀크티
		buttons[1].setBounds(70, 53, 120, 50);
		buttons[1].setBackground(Color.white);
		//스무디
		buttons[2].setBounds(200, 53, 120, 50);
		buttons[2].setBackground(Color.white);
		//----------------------------------------------------------------
		buttons[5].setBounds(70, 5, 120, 50);
		buttons[5].setBackground(Color.white);
		
		buttons[6].setBounds(200, 5, 120, 50);
		buttons[6].setBackground(Color.white);
		
		buttons[7].setBounds(330, 5, 120, 50);
		buttons[7].setBackground(Color.white);
		
		buttons[8].setBounds(460, 5, 120, 50);
		buttons[8].setBackground(Color.white);
		
		buttons[9].setBounds(590, 5, 120, 50);
		buttons[9].setBackground(Color.white);

		buttons[10].setBounds(720, 5, 120, 50);
		buttons[10].setBackground(Color.white);
		//----------------------------------------------------------------
		buttons[3].setBounds(90, 680, 120, 50);
		buttons[3].setBackground(new Color(152, 59, 67));
		buttons[3].setForeground(Color.white);
		
		buttons[4].setBounds(90, 740, 120, 50);	
		buttons[4].setBackground(new Color(152, 59, 67));
		buttons[4].setForeground(Color.white);
		
		Title.add(lbs[0]);
		Title.add(Menubar_lbs_img);
		Title.add(buttons[0]);
		
		for(int i=1;i<3;i++) {
			Menubar.add(buttons[i]);
		}
		for(int i=5;i<11;i++) {
			Menubar.add(buttons[i]);
		}
		
		
		Select.add(new Milktea());
		
		Orderbag.add(Orderbag_lbs_img);
		Orderbag.add(lbs[1]);
		Orderbag.add(Orderlist);	
		for(int i=3;i<5;i++) {
			Orderbag.add(buttons[i]);
		}
		
		Orderlist.add(Orderlist_ta, BorderLayout.CENTER);
		
		buttons[0].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Structure.getter(new Home());
			}
		});
		
		buttons[1].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Select.removeAll();
				Select.add(new Milktea());
				Select.revalidate();
				Select.repaint();			
			}
		});
		
		buttons[2].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Select.removeAll();
				Select.add(new Smoothie());
				Select.revalidate();
				Select.repaint();
			}
		});
		
		buttons[3].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Orderlist_ta!=null) {
				   int r=JOptionPane.showConfirmDialog 
							(null,"선택한 매뉴로 결제를 진행하시겠습까?","알림", JOptionPane.YES_NO_OPTION);
						 if(r==JOptionPane.YES_OPTION) {
							 Structure.getter(new 결제하기());
						 }
				}
				else {
					JOptionPane.showMessageDialog
				    (null, "선택하신 주문내역이 없습니다.", "알림", JOptionPane.WARNING_MESSAGE);
				}
				
			}
		});
		
		buttons[4].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Orderlist_ta.setText("");
				JOptionPane.showMessageDialog
			    (null, "주문이 취소됐습니다", "알림", JOptionPane.INFORMATION_MESSAGE);
		
			}
		});
		
		add(Title);
		add(Menubar);
		add(Select);
		add(Orderbag);
	}
}
