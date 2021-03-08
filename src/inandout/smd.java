package inandout;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class smd extends JFrame {
  public smd() {
 
        
        JFrame frame = new JFrame("smd1");
        frame.setSize(700, 1000);
        frame.getContentPane().setBackground(Color.WHITE);
 
        Panel p = new Panel();
        p.setLayout(null);
        p.setSize(700, 1000);
      
        
        ImageIcon image[]={new ImageIcon("C://Users//82109//Desktop//mango.jpg"),
    			new ImageIcon("C://Users//82109//Desktop//jeju.jpg"),
    			new ImageIcon("C://Users//82109//Desktop//grape.jpg"),
    			new ImageIcon("C://Users//82109//Desktop//grape.jpg"),
    			new ImageIcon("C://Users//82109//Desktop//cheeze.jpg"),
    			new ImageIcon("C://Users//82109//Desktop//choco.jpg")
    	};
          
        JButton bt1[] = new JButton[image.length];
        ImageIcon icon[] = new ImageIcon[image.length];
 
  
        for (int i = 0; i < image.length; i++) {
 
            
           
          bt1[i] = new JButton(image[i]);
            if(i<3) {
            bt1[i].setBounds(25+i*200,200, 106, 172);
            }else {
            	bt1[i].setBounds(25+(i-3)*200, 400, 106, 172);
        }
        
            bt1[i].setBackground(Color.white);
          
            p.add(bt1[i]);
            
            bt1[i].setBorderPainted(false);
        }
    
        frame.add(p, BorderLayout.NORTH);      
        frame.setVisible(true);
  		}
     
    
	
	public static void main(String[] args) {
		new smd();
		}

		}
