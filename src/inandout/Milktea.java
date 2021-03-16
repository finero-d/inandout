package inandout;

import inandout.Option;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Milktea extends JPanel{
	public static String menu = null;
	Milktea(){
		setLayout(null);
	      setBackground(Color.white);
	      setSize(700,1000);
	            
	      JButton black=new JButton();
	      black.setIcon(new ImageIcon("img/black.jpg"));
	      add(black);
	      black.setBounds(0,0,233,330);
	      black.setBorderPainted(false);
	      black.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	            menu = "블랙 밀크티";
	             new Option();
	          }
	      });
	            
	      JButton taro=new JButton();
	      taro.setIcon(new ImageIcon("img/taro.jpg"));
	      add(taro);
	      taro.setBounds(233,0,233,330);
	      taro.setBorderPainted(false);
	      taro.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	            menu = "타로 밀크티";
	            new Option();
	          }
	      });
	            
	      JButton oolong=new JButton();
	      oolong.setIcon(new ImageIcon("img/oolong.jpg"));
	      add(oolong);
	      oolong.setBounds(466,0,233,330);
	      oolong.setBorderPainted(false);
	      oolong.addActionListener(new ActionListener() {
	          public void actionPerformed(ActionEvent e) {
	             menu = "우롱 밀크티";
	             new Option();
	          }
	      });
	            
	      JButton berry=new JButton();
	      berry.setIcon(new ImageIcon("img/berry.jpg"));
	      add(berry);
	      berry.setBounds(0,330,233,330);
	      berry.setBorderPainted(false);
	      berry.addActionListener(new ActionListener() {
	          public void actionPerformed(ActionEvent e) {
	             menu = "딸기 쥬얼리 밀크티";
	             new Option();     
	          }
	      });
	            
	      JButton earlgrey=new JButton();
	      earlgrey.setIcon(new ImageIcon("img/earlgrey.jpg"));
	      add(earlgrey);
	      earlgrey.setBounds(233,330,233,330);
	      earlgrey.setBorderPainted(false);
	      earlgrey.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	            menu = "얼그레이 밀크티";
	            new Option();     
	         }
	      });
	            
	      JButton jasmin=new JButton();
	      jasmin.setIcon(new ImageIcon("img/jasmin.jpg"));
	      add(jasmin);
	      jasmin.setBounds(466, 330, 233, 330);
	      jasmin.setBorderPainted(false);
	      jasmin.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	            menu = "자스민 그린 밀크티";
	            new Option();     
	         }
	      });
	}
}

