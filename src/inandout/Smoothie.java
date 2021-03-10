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
	   mango.addActionListener(new ActionListener() {
		   public void actionPerformed(ActionEvent e) {
			   new Option();
			   menu = "mango";
		   }
	   });
	      
	   JButton grape=new JButton();
	   grape.setIcon(new ImageIcon("img/grape.jpg"));
	   add(grape);
	   grape.setBounds(233,0,233,330);
	   grape.addActionListener(new ActionListener() {
		   public void actionPerformed(ActionEvent e) {
			   new Option();
			   menu = "grape";
		   }
	   });
	      
	   JButton greentea=new JButton();
	   greentea.setIcon(new ImageIcon("img/greentea.jpg"));
	   add(greentea);
	   greentea.setBounds(466,0,233,330);
	   greentea.addActionListener(new ActionListener() {
		   public void actionPerformed(ActionEvent e) {
			   new Option();
			   menu = "greentea";
		   }
	   });
	      
	   JButton cheese=new JButton();
	   cheese.setIcon(new ImageIcon("img/cheese.jpg"));
	   add(cheese);
	   cheese.setBounds(0,330,233,330);
	   cheese.addActionListener(new ActionListener() {
		   public void actionPerformed(ActionEvent e) {
			   new Option();
			   menu = "cheese";
		   }
	   });
	      
	   JButton yogurt=new JButton();
	   yogurt.setIcon(new ImageIcon("img/yogurt.jpg"));
	   add(yogurt);
	   yogurt.setBounds(233,330,233,330);
	   yogurt.addActionListener(new ActionListener() {
		   public void actionPerformed(ActionEvent e) {
			   new Option();
			   menu = "yogurt";
		   }
	   });
	      
	   JButton cookie=new JButton();
	   cookie.setIcon(new ImageIcon("img/cookie.jpg"));
	   add(cookie);
	   cookie.setBounds(466, 330, 233, 330);
	   cookie.addActionListener(new ActionListener() {
		   public void actionPerformed(ActionEvent e) {
			   new Option();
			   menu = "cookie";
		   }
	   });
	      
	   setSize(700,1000);
	   setVisible(true);
   }
}