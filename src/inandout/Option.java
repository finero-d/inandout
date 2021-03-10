package inandout;

import inandout.MenuSelect.*;
import inandout.MenuSelect;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;



public class Option extends JFrame{   
	   Option(){
	      Container c=getContentPane();
	      c.setLayout(null);      
	      
	      String []in= {"COLD(포장)","COLD(매장)","HOT(포장)","HOT(매장)",
	                  "Regular Ice","Full ice","Less Ice",
	                  "50%","100%","30%","70%",
	                  "펄","밀크폼","코코넛","알로에",
	                  "+1000","+1000","+1000","+1000"};
	      
	      JLabel []iname=new JLabel[19];
	      for(int i=0;i<19;i++) {
	         iname[i]=new JLabel(in[i]);
	         c.add(iname[i]);
	      }      
	      iname[0].setBounds(95, 200, 80,80);
	      iname[1].setBounds(275, 200, 80,80);
	      iname[2].setBounds(470, 200, 80,80);
	      iname[3].setBounds(650, 200, 80,80);      
	      iname[4].setBounds(95, 400, 80,80);
	      iname[5].setBounds(285, 400, 80,80);
	      iname[6].setBounds(465, 400, 80,80);      
	      iname[7].setBounds(115, 580, 80,80);
	      iname[8].setBounds(290, 580, 80,80);
	      iname[9].setBounds(475, 580, 80,80);
	      iname[10].setBounds(655, 580, 80,80);      
	      iname[11].setBounds(120, 760, 80,80);
	      iname[12].setBounds(290, 760, 80,80);
	      iname[13].setBounds(470, 760, 80,80);
	      iname[14].setBounds(650, 760, 80,80);
	      iname[15].setBounds(110, 775, 80,80);
	      iname[16].setBounds(290, 775, 80,80);
	      iname[17].setBounds(470, 775, 80,80);
	      iname[18].setBounds(650, 775, 80,80);
	      
	      iname[15].setForeground(Color.blue);
	      iname[16].setForeground(Color.blue);
	      iname[17].setForeground(Color.blue);
	      iname[18].setForeground(Color.blue);
	      
	      
	      JLabel lb1=new JLabel("밀크티");
	      JLabel lb2=new JLabel("COLD/HOT");
	      JLabel lb3=new JLabel("얼음");
	      JLabel lb4=new JLabel("당도");
	      JLabel lb5=new JLabel("토핑");
	      Font f=new Font("Aharoni 굵게",Font.BOLD,25);
	      Font f1=new Font("Aharoni 굵게",Font.BOLD,50);
	      
	      lb1.setFont(f1);
	      lb1.setForeground(Color.red);
	      lb2.setFont(f);
	      lb3.setFont(f);
	      lb4.setFont(f);
	      lb5.setFont(f);
	      
	      lb1.setBounds(0,0, 200,50);
	      lb2.setBounds(0,80, 150,50 );      
	      lb3.setBounds(0,280, 150,50 );
	      lb4.setBounds(0,460, 150,50 );
	      lb5.setBounds(0,640, 150,50 );
	      
	      
	      
	       ImageIcon cold_d=new ImageIcon("C:/Users/성수/Desktop/공차/콜드 포장.png");
	       JLabel img1=new JLabel(cold_d);
	       ImageIcon cold_m=new ImageIcon("C:/Users/성수/Desktop/공차/콜드매장.png");
	       JLabel img2=new JLabel(cold_m);
	       ImageIcon hot_d=new ImageIcon("C:/Users/성수/Desktop/공차//핫(포장).png");
	       JLabel img3=new JLabel(hot_d);
	       ImageIcon hot_m=new ImageIcon("C:/Users/성수/Desktop/공차/핫(매장).png");
	       JLabel img4=new JLabel(hot_m);       
	       ImageIcon ice_r=new ImageIcon("C:/Users/성수/Desktop/공차/regular ice.png");
	       JLabel img5=new JLabel(ice_r);
	       ImageIcon ice_f=new ImageIcon("C:/Users/성수/Desktop/공차/full ice.png");
	       JLabel img6=new JLabel(ice_f);
	       ImageIcon ice_l=new ImageIcon("C:/Users/성수/Desktop/공차/less ice.png");
	       JLabel img7=new JLabel(ice_l);
	       ImageIcon p50=new ImageIcon("C:/Users/성수/Desktop/공차/50.png");
	       JLabel img8=new JLabel(p50);
	       ImageIcon p100=new ImageIcon("C:/Users/성수/Desktop/공차/100.png");
	       JLabel img9=new JLabel(p100);
	       ImageIcon p30=new ImageIcon("C:/Users/성수/Desktop/공차/30.png");
	       JLabel img10=new JLabel(p30);
	       ImageIcon p70=new ImageIcon("C:/Users/성수/Desktop/공차/70.png");
	       JLabel img11=new JLabel(p70);
	       ImageIcon pearl=new ImageIcon("C:/Users/성수/Desktop/공차/펄.png");
	       JLabel img12=new JLabel(pearl);
	       ImageIcon milkform=new ImageIcon("C:/Users/성수/Desktop/공차/밀크폼.png");
	       JLabel img13=new JLabel(milkform);
	       ImageIcon coconut=new ImageIcon("C:/Users/성수/Desktop/공차/코코넛.png");
	       JLabel img14=new JLabel(coconut);
	       ImageIcon aloe=new ImageIcon("C:/Users/성수/Desktop/공차/알로에.png");
	       JLabel img15=new JLabel(aloe);
	       
	       
	       img1.setBounds(90, 150, 75,75);
	       img2.setBounds(270, 150, 75,75);
	       img3.setBounds(450, 150, 75,75);
	       img4.setBounds(630, 150, 75,75);
	       img5.setBounds(90, 350, 75,75);
	       img6.setBounds(270, 350, 75,75);
	       img7.setBounds(450, 350, 75,75);
	       img8.setBounds(90, 530, 75,75);
	       img9.setBounds(270, 530, 75,75);
	       img10.setBounds(450, 530, 75,75);
	       img11.setBounds(630, 530, 75,75);
	       img12.setBounds(90, 710, 75,75);
	       img13.setBounds(270, 710, 75,75);
	       img14.setBounds(450, 710, 75,75);
	       img15.setBounds(630, 710, 75,75);         
	         
	      
	      JRadioButton [] rdio=new JRadioButton[4];
	       for(int i=0;i<4;i++) {            
	         rdio[i]=new JRadioButton();
	         rdio[i].setBackground(Color.white);
	         c.add(rdio[i]);         
	         }
	       JRadioButton [] rdio1=new JRadioButton[3];
	       for(int i=0;i<3;i++) {            
	         rdio1[i]=new JRadioButton();
	         rdio1[i].setBackground(Color.white);
	         c.add(rdio1[i]);         
	         }
	       JRadioButton [] rdio2=new JRadioButton[4];
	       for(int i=0;i<4;i++) {            
	         rdio2[i]=new JRadioButton();
	         rdio2[i].setBackground(Color.white);
	         c.add(rdio2[i]);         
	         }   
	      ButtonGroup grp=new ButtonGroup();
	      ButtonGroup grp1=new ButtonGroup();
	      ButtonGroup grp2=new ButtonGroup();      
	         grp.add(rdio[0]);
	         grp.add(rdio[1]);      
	          grp.add(rdio[2]);
	          grp.add(rdio[3]);
	          grp1.add(rdio1[0]);      
	         grp1.add(rdio1[1]);
	         grp1.add(rdio1[2]);
	         grp2.add(rdio2[0]);
	         grp2.add(rdio2[1]);
	         grp2.add(rdio2[2]);
	         grp2.add(rdio2[3]);
	         
	         
	       rdio[0].setBounds(120,130,20,20);       
	       rdio[1].setBounds(300,130,20,20);
	       rdio[2].setBounds(480,130,20,20);
	       rdio[3].setBounds(660,130,20,20);
	       
	       rdio1[0].setBounds(120,330,20,20);
	       rdio1[1].setBounds(300,330,20,20);       
	       rdio1[2].setBounds(480,330,20,20);
	       
	       rdio2[0].setBounds(120,510,20,20);
	       rdio2[1].setBounds(300,510,20,20);
	       rdio2[2].setBounds(480,510,20,20);
	       rdio2[3].setBounds(660,510,20,20);
	       
	       /*rdio[0].setSelected(true);
	       rdio[4].setSelected(true);
	       rdio[7].setSelected(true);*/
	       
	       JCheckBox []jch=new JCheckBox[4];
	       for(int i=0;i<4;i++) {
	          jch[i]=new JCheckBox();
	          jch[i].setBackground(Color.white);
	          c.add(jch[i]);
	       }
	           
	       jch[0].setBounds(120,690,20,20);
	       jch[1].setBounds(300,690,20,20);
	       jch[2].setBounds(480,690,20,20);
	       jch[3].setBounds(660,690,20,20);
	       
	       JButton jb1=new JButton("이전");
	       JButton jb2=new JButton("다음");
	       
	       jb1.setBounds(200,850,150,50);
	       jb2.setBounds(400,850,150,50);
	       
	       jb1.addActionListener(new ActionListener() {         
	         public void actionPerformed(ActionEvent e) {
	            System.exit(0);            
	         }
	      });
	       jb2.addActionListener(new ActionListener() {         
	            public void actionPerformed(ActionEvent e) {               
	               Enumeration<AbstractButton> enums = grp.getElements();               
	               while(enums.hasMoreElements()) {
	                  AbstractButton ab=enums.nextElement();
	                  for(int i=0;i<3;i++) {
	                     rdio[i]=(JRadioButton)ab;
	                     if(rdio[i].isSelected()) {
	                        if(rdio[0].isSelected()) {
	                           MenuSelect.Orderlist_ta.setText("\n"+"COLD(포장)"+" ");
	                        }
	                        else if(rdio[1].isSelected()) {
	                           MenuSelect.Orderlist_ta.setText("\n"+"COLD(매장)"+" ");
	                        }
	                        else if(rdio[2].isSelected()) {
	                           MenuSelect.Orderlist_ta.setText("\n"+"HOT(포장)"+" ");
	                        }
	                        else if(rdio[3].isSelected()) {
	                              MenuSelect.Orderlist_ta.setText("\n"+"HOT(매장)"+" ");
	                        }
	                     
	                        Enumeration<AbstractButton> enums1 = grp1.getElements();               
	                        while(enums1.hasMoreElements()) {
	                           AbstractButton ab1=enums1.nextElement();
	                           for(int j=0;j<3;j++) {
	                              rdio1[j]=(JRadioButton)ab1;
	                              if(rdio1[j].isSelected()) {
	                                 /*if(rdio1[0].isSelected()) {
	                                    Menuselect.Orderlist_ta.setText("Regular Ice"+" ");
	                                 }
	                                 if(rdio1[1].isSelected()) {
	                                    Menuselect.Orderlist_ta.setText("Full Ice"+" ");
	                                 }
	                                 if(rdio1[2].isSelected()) {
	                                    Menuselect.Orderlist_ta.setText("Less Ice"+" ");
	                                 }*/
	                                 Enumeration<AbstractButton> enums2 = grp2.getElements();               
	                                 while(enums2.hasMoreElements()) {
	                                    AbstractButton ab2=enums2.nextElement();
	                                    for(int k=0;k<4;k++) {
	                                       rdio2[k]=(JRadioButton)ab2;
	                                       if(rdio2[k].isSelected()) {   
	                                          /*if(rdio2[0].isSelected()) {
	                                             Menuselect.Orderlist_ta.setText("50%"+" ");
	                                          }
	                                          if(rdio2[1].isSelected()) {
	                                             Menuselect.Orderlist_ta.setText("100%"+" ");
	                                          }
	                                          if(rdio2[2].isSelected()) {
	                                             Menuselect.Orderlist_ta.setText("30%"+" ");
	                                          }
	                                          if(rdio2[3].isSelected()) {
	                                                Menuselect.Orderlist_ta.setText("70%"+" ");
	                                          }*/
	                                          setVisible(false);;
	                                       }         
	                                    }   
	                                 }            
	                                 
	                              }         
	                           }   
	                         }            
	                     }
	                              }   
	            }            
	               JOptionPane.showMessageDialog(null, "메뉴 선택해주세요");
	               
	               
	          }         
	      });
	       
	      
	      c.add(jb1);
	      c.add(jb2);
	      c.add(lb1);
	      c.add(lb2);
	      c.add(lb3);
	      c.add(lb4);
	      c.add(lb5);      
	      c.add(img1);
	      c.add(img2);
	      c.add(img3);
	      c.add(img4);
	      c.add(img5);
	      c.add(img6);
	      c.add(img7);
	      c.add(img8);
	      c.add(img9);
	      c.add(img10);
	      c.add(img11);
	      c.add(img12);
	      c.add(img13);
	      c.add(img14);
	      c.add(img15);   
	      
	      c.setBackground(Color.white);
	      setLocation(500,0);
	      setSize(800,1000);
	      setVisible(true);      
	      
	   }    
	      
	   public static void main(String[] args) {
	      new Option();      
	      
	   }

	}