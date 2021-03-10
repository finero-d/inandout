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
	Milktea(){
		setLayout(null);
		setBackground(Color.white);
		setSize(700,1000);
		      
		JButton black=new JButton();
		black.setIcon(new ImageIcon("img/black2.jpg"));
		add(black);
		black.setBounds(0,0,200,250);
		black.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		    	new Option();
		    }
		});
		      
		JButton taro=new JButton();
		taro.setIcon(new ImageIcon("img/taro2.jpg"));
		add(taro);
		taro.setBounds(350,0,200,250);
		taro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Option();
		    }
		});
		      
		JButton oolong=new JButton();
		oolong.setIcon(new ImageIcon("img/oolong2.jpg"));
		add(oolong);
		oolong.setBounds(0,333,200,250);
		oolong.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	new Option();
		    }
		});
		      
		JButton berry=new JButton();
		berry.setIcon(new ImageIcon("img/berry2.jpg"));
		add(berry);
		berry.setBounds(350,333,200,250);
		berry.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	new Option();	  
		    }
		});
		      
		JButton earlgrey=new JButton();
		earlgrey.setIcon(new ImageIcon("img/earlgrey2.jpg"));
		add(earlgrey);
		earlgrey.setBounds(0,666,200,250);
		earlgrey.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Option();	  
			}
		});
		      
		JButton jasmin=new JButton();
		jasmin.setIcon(new ImageIcon("img/jasmin2.jpg"));
		add(jasmin);
		jasmin.setBounds(350,666,200,250);
		jasmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Option();	  
			}
		});
	}
}

