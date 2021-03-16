package inandout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Smoothie extends JPanel{
	public static String menu = null;
   Smoothie(){
	      
	   setLayout(null);
	      
	   JButton mango=new JButton();
	   mango.setIcon(new ImageIcon("img/mango.jpg"));
	   add(mango);
	   mango.setBounds(0,0,233,330);
	   mango.setBorderPainted(false);
	   mango.addActionListener(new ActionListener() {
		   public void actionPerformed(ActionEvent e) {
			   Milktea.menu = "망고 스무디";
			   new Option();
		   }
	   });
	      
	   JButton grape=new JButton();
	   grape.setIcon(new ImageIcon("img/grape.jpg"));
	   add(grape);
	   grape.setBounds(233,0,233,330);
	   grape.setBorderPainted(false);
	   grape.addActionListener(new ActionListener() {
		   public void actionPerformed(ActionEvent e) {
			   Milktea.menu = "청포도 스무디";
			   new Option();
		   }
	   });
	      
	   JButton greentea=new JButton();
	   greentea.setIcon(new ImageIcon("img/greentea.jpg"));
	   add(greentea);
	   greentea.setBounds(466,0,233,330);
	   greentea.setBorderPainted(false);
	   greentea.addActionListener(new ActionListener() {
		   public void actionPerformed(ActionEvent e) {
			   Milktea.menu = "제주 그린티 스무디";
			   new Option();
		   }
	   });
	      
	   JButton cheese=new JButton();
	   cheese.setIcon(new ImageIcon("img/cheese.jpg"));
	   add(cheese);
	   cheese.setBounds(0,330,233,330);
	   cheese.setBorderPainted(false);
	   cheese.addActionListener(new ActionListener() {
		   public void actionPerformed(ActionEvent e) {
			   Milktea.menu = "치즈폼 딥초코 스무디";
			   new Option();
		   }
	   });
	      
	   JButton yogurt=new JButton();
	   yogurt.setIcon(new ImageIcon("img/yogurt.jpg"));
	   add(yogurt);
	   yogurt.setBounds(233,330,233,330);
	   yogurt.setBorderPainted(false);
	   yogurt.addActionListener(new ActionListener() {
		   public void actionPerformed(ActionEvent e) {
			   Milktea.menu = "딸기 요구르트 크러쉬";
			   new Option();
		   }
	   });
	      
	   JButton cookie=new JButton();
	   cookie.setIcon(new ImageIcon("img/cookie.jpg"));
	   add(cookie);
	   cookie.setBounds(466, 330, 233, 330);
	   cookie.setBorderPainted(false);
	   cookie.addActionListener(new ActionListener() {
		   public void actionPerformed(ActionEvent e) {
			   Milktea.menu = "초코 쿠앤크 스무디";
			   new Option();
		   }
	   });
	      
	   setSize(700,1000);
	   setVisible(true);
   }
}