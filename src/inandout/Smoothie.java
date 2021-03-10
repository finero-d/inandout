package inandout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Smoothie extends JPanel{
	   Smoothie(){
	      
	      setLayout(null);
	      
	      JButton mango=new JButton();
	      mango.setIcon(new ImageIcon("img/mango.jpg"));
	      add(mango);
	      mango.setBounds(0,0,200,250);
	      
	      JButton grape=new JButton();
	      grape.setIcon(new ImageIcon("img/grape.jpg"));
	      add(grape);
	      grape.setBounds(350,0,200,250);
	      
	      JButton greentea=new JButton();
	      greentea.setIcon(new ImageIcon("img/greentea.jpg"));
	      add(greentea);
	      greentea.setBounds(0,250,200,250);
	      
	      JButton cheese=new JButton();
	      cheese.setIcon(new ImageIcon("img/cheese.jpg"));
	      add(cheese);
	      cheese.setBounds(350,250,200,250);
	      
	      JButton yogurt=new JButton();
	      yogurt.setIcon(new ImageIcon("img/yogurt.jpg"));
	      add(yogurt);
	      yogurt.setBounds(0,500,200,250);
	      
	      JButton cookie=new JButton();
	      cookie.setIcon(new ImageIcon("img/cookie.jpg"));
	      add(cookie);
	      cookie.setBounds(350, 500, 200, 250);
	      
	      
	      setSize(700,1000);
	      setVisible(true);
	   }
	   public static void main(String[] args) {
	      

	   }

	}