package inandout;
import inandout.Structure;
import inandout.Home;

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
		Title.setBackground(Color.red);
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
		Orderbag.setBackground(Color.red);
		Orderbag.setLayout(null);
		
		Orderlist.setSize(245, 560);
		Orderlist.setLocation(20, 100);
		Orderlist.setBackground(Color.red);
		Orderlist.setLayout(new BorderLayout(10,15));
		
		Font font=new Font("Bernard MT", Font.BOLD, 15);
		Font fonts=new Font("Bernard MT", Font.BOLD, 20);
	
		JLabel lbs[]=new JLabel[2];
		String messege_lb[]= {"주문하려면 메뉴를 클릭해 주세요","장바구니"};
		for(int i=0;i<lbs.length;i++) {
			lbs[i]=new JLabel(messege_lb[i]);
			lbs[i].setForeground(Color.white);
		}	
		
		ImageIcon img_home=new ImageIcon("C:/Users/USER/Desktop/취성패/팀프로젝트 사진/홈버튼.png");
		ImageIcon img_order=new ImageIcon("C:/Users/USER/Desktop/취성패/팀프로젝트 사진/장바구니.jpg");
		JLabel Menubar_lbs_img=new JLabel(img_home);
		JLabel Orderbag_lbs_img=new JLabel(img_order);
		
		JButton buttons[]=new JButton[5];
		String name_bt[]= {"시작화면","밀크티","스무디","결제하기", "전체삭제"};
		for(int i=0;i<buttons.length;i++) {
			buttons[i]=new JButton(name_bt[i]);
			buttons[i].setFont(font);
			buttons[i].setBorderPainted(false);
		}
		
		TextArea Orderlist_ta=new TextArea(10,20);
		Orderlist_ta.setFont(fonts);
				
		lbs[0].setBounds(100, 0, 500, 100);
		lbs[0].setFont(fonts);
		
		lbs[1].setBounds(140, 30, 100, 50);
		lbs[1].setFont(font);
		
		Menubar_lbs_img.setBounds(650, 20, 50, 50);
		Orderbag_lbs_img.setBounds(80, 30, 50, 50);
		
		buttons[0].setBounds(700, 20, 120, 50);
		buttons[0].setBackground(Color.red);
		buttons[0].setForeground(Color.white);
		
		buttons[1].setBounds(100, 20, 120, 50);
		buttons[1].setBackground(Color.white);
		
		buttons[2].setBounds(250, 20, 120, 50);
		buttons[2].setBackground(Color.white);
		
		buttons[3].setBounds(90, 680, 120, 50);
		buttons[3].setBackground(Color.red);
		buttons[3].setForeground(Color.white);
		
		buttons[4].setBounds(90, 740, 120, 50);	
		buttons[4].setBackground(Color.red);
		buttons[4].setForeground(Color.white);
		
		Title.add(lbs[0]);
		Title.add(Menubar_lbs_img);
		Title.add(buttons[0]);
		
		for(int i=1;i<3;i++) {
			Menubar.add(buttons[i]);
		}
		
		/*Select.add(); 밀크티 클래스 추가*/
		
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
				/*Select.removeAll();
				Select.add(); 밀크티 클래스 추가
				Select.revalidate();
				Select.repaint();*/			
			}
		});
		
		buttons[2].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*Select.removeAll();
				Select.add(); 스무디 클래스 추가
				Select.revalidate();
				Select.repaint();*/
			}
		});
		
		buttons[3].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int r=JOptionPane.showConfirmDialog 
					(null,"주문을 계속하시겠습니까?","확인", JOptionPane.YES_NO_OPTION);
				 /*if(r==JOptionPane.YES_OPTION) {
					 Structure.getter(new 결제하기());
				 }*/ //지선씨 부분			
			}
		});
		
		buttons[4].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Orderlist_ta.setText("");
				JOptionPane.showMessageDialog
			    (null, "선택하신 주문이 취소됐습니다.", "알림", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		add(Title);
		add(Menubar);
		add(Select);
		add(Orderbag);
				
	}

}
